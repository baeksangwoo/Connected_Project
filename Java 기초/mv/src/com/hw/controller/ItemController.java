package com.hw.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hw.vo.Item;
import com.hw.vo.User;

@Controller

public class ItemController {
		
	@RequestMapping("/itemlist.do")
	public String list(Model m) {
		ArrayList<Object>list=null;
		list = new ArrayList<>();
		list.add(new Item(001,"��ũ����",10000));
		list.add(new Item(002,"���̾�����",20000));
		list.add(new Item(003,"������",30000));
		list.add(new Item(004,"����ġ����",15000));
		list.add(new Item(005,"��������",25000));
		m.addAttribute("itemlist",list);
		m.addAttribute("center","item/list");
		return "main";
	}
	@RequestMapping("/itemadd.do")
	public String add(Model m) {
		m.addAttribute("center","item/add");
		return "main";
	}
	
	@RequestMapping("/itemaddimpl.do")
	public String addimpl(Model m,Item i) {
		//db�� �Է��Ѵ�
		System.out.println("addimpl:"+m);
		m.addAttribute("center","item/addok");
		return "main";
	}
	
	
}



