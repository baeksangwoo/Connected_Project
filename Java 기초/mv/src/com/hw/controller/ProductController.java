package com.hw.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.hw.vo.Product;

@Controller

public class ProductController {
		
	@RequestMapping("/productlist.do")
	public String list(Model m) {
		ArrayList<Object>list=null;
		list = new ArrayList<>();
		 list.add(new Product(100,"cap1",1000, new Date(2018,03,06), "m1.jpg"));
		 list.add(new Product(200,"cap2",2000, new Date(2018,03,06), "m2.jpg"));
		 list.add(new Product(300,"cap3",3000, new Date(2018,03,06), "m3.jpg"));
		 list.add(new Product(500,"cap5",5000, new Date(2018,03,06), "m5.jpg"));
		m.addAttribute("productlist", list);
		m.addAttribute("center","product/list");
		return "main";
	}
	@RequestMapping("/productadd.do")
	public String add(Model m) {
		m.addAttribute("center","product/add");
		return "main";
	}
	@RequestMapping("/productaddimpl.do")
	public String addimpl(Model m,Product p) {
		System.out.println(p);
		MultipartFile mf=p.getMf();
		String imgName=mf.getOriginalFilename();
		System.out.println(imgName);
		
		//C:\\spring\\mv\\web\\img
		byte[] data=null;
		FileOutputStream fo=null;
		try{
		data=mf.getBytes();
		fo=new FileOutputStream("C:\\spring\\mv\\web\\img\\"+imgName);
		fo.write(data);
		
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
			fo.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		//db�� �Է�
		m.addAttribute("imgname",imgName);
		m.addAttribute("center","product/addok");
		return "main";
	}
	
	
}



