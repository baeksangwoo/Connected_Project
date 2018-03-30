package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/requestmethod.do")
public class RequestMethodController {
	@RequestMapping(method=RequestMethod.GET)
	public String myGet()
	{
		System.out.println("GET 방식 요청 처리...");
		return "getResult";
	}
	@RequestMapping(method=RequestMethod.POST)
	public String myPost(){
		System.out.println("POST 방식 요청 처리.....");
		return "postResult";
	}
}
