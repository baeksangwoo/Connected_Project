package com.hw.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hw.car_ChargingList.Car_ChargingListBiz;
import com.hw.car_ChargingList.Car_ChargingListDao;
import com.hw.frame.Biz;
import com.hw.vo.Car_Air_condition;
import com.hw.vo.Car_ChargingList;
import com.hw.vo.Car_control;
import com.hw.vo.Car_latlong;
import com.hw.vo.Car_status;
import com.hw.vo.ChargerStation;
import com.hw.vo.Member;

import geocoding.GeocodingAPI;

@Controller
public class MainController {

	GeocodingAPI geocodingAPI = new GeocodingAPI();
	
	public MainController() {
	}

	@Resource(name = "memberBiz") // ���� ��蹂� 愿�由� BIZ
	Biz<Member, String> biz;
	
	@Resource(name = "chargerstationBiz") 
	Biz<ChargerStation, String> biz_Station;
	
	@Resource(name = "car_statusBiz")
	Biz<Car_status, String> biz2;
	@Resource(name="Car_Air_conditionBiz")// 차의 Air Condition
	Biz<Car_Air_condition, String> Airbiz;

	@Resource(name="Car_ChargingListBiz")// 차의 충전 status
	@Inject
	Car_ChargingListBiz ChargingListbiz;
	
	//Biz<Car_ChargingList, String> ChargingListbiz;
	
	@Resource(name="Car_latlongBiz")// paging start end
	Biz<Car_latlong, String> startendbiz;
	
	
	@InitBinder
	public void DateBinder( WebDataBinder dataBinder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		dataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));	
	}
	
	@RequestMapping("/air_insert.do")
	public void air_insert(HttpServletResponse res, Car_Air_condition car_Air) throws Exception {
		res.setCharacterEncoding("UTF-8");
		PrintWriter out = res.getWriter();
		
		System.out.println(car_Air.toString());
		try {
			Airbiz.register(car_Air);
			out.println("1");
		} catch (Exception e) {
			e.printStackTrace();
			out.println("0");
		}
		out.close();
	}
	

 	@RequestMapping("/charging_insert.do")
	public void air_insert(HttpServletResponse res, Car_ChargingList car_charging) throws Exception {
		res.setCharacterEncoding("UTF-8");
		PrintWriter out = res.getWriter();
		String s= "comeon";
		Car_ChargingList sim=ChargingListbiz.get(s);
		String placename=sim.getAddr()+sim.getName();
		car_charging.setCar_charging_place(placename);
		Random random =new Random();
		int d=random.nextInt(4); // 0부터 2까지
		
		if(d==0)
		{
			car_charging.setCar_charging_status("Charging");
		}else if(d==1) {
			car_charging.setCar_charging_status("Delay");	
		}else if (d==2) {
			car_charging.setCar_charging_status("Cancel");
		}
		else {
			car_charging.setCar_charging_status("Charging");
		}
		
		Date dt = new Date();		
		car_charging.setCar_charging_date(dt);

		try {
			ChargingListbiz.register(car_charging);
			out.println("1");
		} catch (Exception e) {
			e.printStackTrace();
			out.println("0");
		}
		out.close();
	}

	@RequestMapping("/status_update.do")
	public void status_update(HttpServletResponse res, Car_status car_status) throws Exception {
		res.setCharacterEncoding("UTF-8");
		PrintWriter out = res.getWriter();
		System.out.println(car_status.toString());
		try {
			biz2.modify(car_status);
			out.println("1");
		} catch (Exception e) {
			e.printStackTrace();
			out.println("0");
		}
		out.close();
	}

	@RequestMapping("/login.do")
	public void login(HttpServletResponse res, Member member) throws Exception {
		res.setCharacterEncoding("UTF-8");
		PrintWriter out = res.getWriter();
		String email = member.getEmail();
		String pwd = member.getPwd();
		Member mem = biz.get(email); 

		if (biz.get(email) != null && mem.getEmail().equals(email) && mem.getPwd().equals(pwd)) { // �대��쇰� 諛��� 寃���																						// NULL 媛��몄� ����吏�
			out.println("1");
		} else {
			out.println("0");
		}
		out.close();
	}

	// ����媛���
	@RequestMapping("/join.do")
	public void join(HttpServletResponse res, Member member) throws Exception {
		System.out.println("����媛��� ����");
		res.setCharacterEncoding("UTF-8");
		PrintWriter out = res.getWriter();
		System.out.println(member.toString());
		try {
			biz.register(member);
			out.println("1");
		} catch (Exception e) {
			e.printStackTrace();
			out.println("0");
		}
		out.close();
	}

	Logger logger = Logger.getLogger("work");

	@RequestMapping("/main.do")
	public String main(HttpServletRequest request) {
		String speed = request.getParameter("speed");
		System.out.println(speed);
		logger.debug("speed: " + speed); // 濡�洹몄�� 李���
		return "main";
	}

	@RequestMapping("/oracles.do")
	public String isnd(HttpServletRequest request) {
		return "pdh";
	}

	@RequestMapping("/weather.do")
	public String weather(HttpServletRequest request) {

		return "redirect:https://m.weather.naver.com/";

	}

	@RequestMapping("/map.do") // 理��� 嫄곕━ 援ы��湲� ��怨�由ъ� ��吏�
	public String maps(HttpServletRequest request, double car_lat, double car_lng) throws Exception {
		return "map";
	}

	// 由ъ�� �⑥�ㅼ����
	@RequestMapping("/reset.do")
	public void resest(HttpServletResponse res, Member member) throws Exception {
		res.setCharacterEncoding("UTF-8");
		PrintWriter out = res.getWriter();
		System.out.println(member.toString());
		try {
			biz.modify(member);
			out.println("1");
		} catch (Exception e) {
			e.printStackTrace();
			out.println("0");
		}

		out.close();
	}

	
	//model and view 방식
	@RequestMapping("/admin.do") 
	public ModelAndView admin(HttpServletRequest request) throws Exception {
		List<Car_ChargingList> charginglist=ChargingListbiz.get();		
		//modelandview 방식 spring 방식
		ModelAndView mav = new ModelAndView();
		mav.addObject("charginglist", charginglist);//setattribute
		mav.setViewName("admin"); //
		return mav;
	}
	
	//jsp 방식 사실 spring과 섞은 것이라 동작이 안된다.
	/*
	 @RequestMapping("/admin.do") 
	public String admin(HttpServletRequest request ,HttpServletResponse response) throws Exception {
		
		List<Car_ChargingList> charginglist=ChargingListbiz.get();
		response.setCharacterEncoding("UTF-8");
		request.setAttribute("charginglist", charginglist);
		RequestDispatcher dispatcher =request.getRequestDispatcher("admin.jsp");
		dispatcher.forward(request, response);
	}
	 */

	@Resource(name = "car_controlBiz")
	Biz<Car_control, String> biz3;
	// 제어 테이블 값 받기
	@RequestMapping("/control_get.do")
	public void control_update(HttpServletResponse res, Car_control car_control) throws Exception {
		res.setCharacterEncoding("UTF-8");
		PrintWriter out = res.getWriter();
		try {
			String code = "GENSDE123";
			car_control = biz3.get(code); // 해당 코드를 가진 모델의 값을 받는다
			Car_status car_status = biz2.get(code); // 해당 코드를 가진 차량의 상태를 받는다

			// reverse Geocoding
			GeocodingAPI geocodingAPI = new GeocodingAPI();
			String addres = geocodingAPI.request(car_status.getLatitude(), car_status.getLongtitude());

			out.print(car_control.getSet_temp() + "/"); // 설정 온도 받기 //0
			out.print(car_control.getSet_cool() + "/"); // 1
			out.print(car_control.getSet_warm() + "/"); // 2
			out.print(car_status.getAvailable_distance() + "/"); // 차량상태의 이동가능거리 //3
			out.print(Math.round(car_status.getBattery_capacity()) + "/"); // 차량 상태의 현재 배터리양 //4
			out.print(car_status.getIndoor_temp() + "/"); // 차량 상태의 현재 실내 온도 //5
			out.print(car_control.getSet_charging_amount() + "/"); // 6
			out.print(car_control.getCharging_port() + "/"); // 7
			out.print(car_control.getCode() + "/"); // 8
			out.print(car_control.getSet_wind() + "/"); // 9
			out.print(addres); // 10
			out.flush();

		} catch (Exception e) {
			e.printStackTrace();

		}

		out.close();
	}

	@RequestMapping("/setTemp.do")
	public void phone_temp_get(HttpServletResponse res, Car_control car_control) throws Exception {
		res.setCharacterEncoding("UTF-8");
		PrintWriter out = res.getWriter();
		try {
			// String code = "GENSDE123";
			// 불러와서 모든 열의 값을 보내고 다시 전부 받는다.
			// biz3.get(code);
			// out.print(car_control.getSet_temp() + "/");
			// out.print(car_control.getSet_wind() + "/");
			// out.print(car_control.getSet_cool() + "/");
			// out.print(car_control.getSet_warm() + "/");
			// out.print(car_control.getSet_charging_amount() + "/");
			// out.print(car_control.getCharging_port() + "/");
			// out.print(car_control.getCode());
			// System.out.println(car_control.toString());
			out.println("success");
			// 다시 받아 등록하기
	
			System.out.println(car_control.toString());
			
			biz3.register(car_control);
			System.out.println("success");

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	//biz_Station
	@SuppressWarnings("unchecked")
	 @RequestMapping(value="/mapimpl.do")
	   public void showDanger(HttpServletResponse res,Model model) {
	
		res.setCharacterEncoding("UTF-8");
		   PrintWriter out = null;
		   try {
		      out = res.getWriter();
		   } catch (IOException e) {
		      e.printStackTrace();
		   }
		   List<ChargerStation> list =  biz_Station.get();
		 //list에서 가져올때 모든 것을 가져오는 것이다.
		   JSONArray obj_arr = new JSONArray();
		    String address = "";
		 
		   for(ChargerStation danger: list) {      
		      try {
		         address=geocodingAPI.request( Double.parseDouble(danger.getCs_lat()), Double.parseDouble(danger.getCs_lng()));
		         address=danger.getCs_name();
		      } catch (Exception e) {
		         e.printStackTrace();
		      }
		      JSONObject obj = new JSONObject();
		      obj.put("lat",  Double.parseDouble(danger.getCs_lat()));
		      obj.put("lng",  Double.parseDouble(danger.getCs_lng()));
		      obj.put("address", address);
		      obj.put("dLevel",danger.getCs_addr());
		      obj.put("dTime",danger.getCs_times());
		      obj_arr.add(obj);
		      System.out.println(obj);
		      
		   }   
		   res.setContentType("application/json");
		   out.print(obj_arr.toJSONString());
		   System.out.println(obj_arr.toJSONString());
		   out.close();
	}
	
	//paging 처리 
	@SuppressWarnings("unchecked")
	 @RequestMapping(value="/paging.do") //페이징 처리가 있을 때마다 여기가 실행된다.
	   public String paging(HttpServletResponse res, HttpServletRequest request,Model m) {	
		
		res.setCharacterEncoding("UTF-8");	
		int end = Integer.parseInt(request.getParameter("num")); //num이라는 변수를 받는다.	
		List<Car_ChargingList> charginglist = ChargingListbiz.getall(end);	
		
		m.addAttribute("charginglist", charginglist);//setattribute
		System.out.println("작동!");
		m.addAttribute("center", "paging");
		return "admin";
	}
	

	@RequestMapping("/chart5.do")
	public String chart5(Model m) {
		m.addAttribute("center", "chart5");
		System.out.println("chart5.jsp 작동");
		return "main";

	}
	
}
