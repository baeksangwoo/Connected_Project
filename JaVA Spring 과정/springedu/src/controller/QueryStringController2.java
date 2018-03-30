package controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import vo.QueryVO;

@Controller
public class QueryStringController2 {
	@RequestMapping("/querystring5.do")
	public ModelAndView proc(QueryVO vo){
		ModelAndView mav = new ModelAndView();
		String name= vo.getTestName();
		int age = vo.getTestAge();
		String addr= vo.getTestAddr();
		
		mav.addObject("spring",name+"-"+age+"-"+addr);
		
		mav.setViewName("queryview2");
		return mav;
	}
	
	@RequestMapping(value="/querystring6",
						method=RequestMethod.POST)
	public ModelAndView procPost(QueryVO vo){
		ModelAndView mav = new ModelAndView();
		String name=vo.getTestName();
		int age=vo.getTestAge();
		String addr=vo.getTestAddr();
		
		mav.addObject("spring",name+"@"+age+"@"+addr);
		mav.setViewName("queryview2");
		return mav;
	}
	
	@RequestMapping("/querystring7")
	public ModelAndView proc(HttpServletRequest request){
		ModelAndView mav = new ModelAndView();
		String name=request.getParameter("testName");
		int age= Integer.parseInt(request.getParameter("testAge"));
		String addr= request.getParameter("testAddr");
		mav.addObject("spring",name+"#"+age+"#"+addr);
		mav.setViewName("queryview2");
		return mav;
	}
	
	@RequestMapping(value="/locale.do")
	public ModelAndView proc(Locale l){
		ModelAndView mav = new ModelAndView();
		mav.addObject("spring","Locale 처리........"+l.getDisplayCountry()+"_"+l.getDisplayLanguage());
		mav.setViewName("queryview2");
		return mav;
	}
}
