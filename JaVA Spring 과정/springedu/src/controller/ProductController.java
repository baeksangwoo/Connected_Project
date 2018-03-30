package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import vo.ProductVO;


@Controller
@SessionAttributes("count1")
public class ProductController {
	@ModelAttribute("count1")
	public ProductVO countMethod1(){
		ProductVO vo= new ProductVO();
		return vo;
	}
	
	@RequestMapping(value="/product.do")
	public String handle(@ModelAttribute("count1")ProductVO vo1)
	{
		return "productView";		
	}
	@RequestMapping(value="/buy.do")
	public String handle(SessionStatus status){
		if(status.isComplete()){
			System.out.println("이미 COMPLETE 됨");
		}
		else{
			System.out.println("이번에 COMPLETE 시킴");
			status.setComplete();
			}
		return "productView";		

	}
		
}
