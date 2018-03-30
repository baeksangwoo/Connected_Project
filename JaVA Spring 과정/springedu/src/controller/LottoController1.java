package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.LottoService;
import vo.LottoVO;

@Controller
public class LottoController1 {

	public LottoController1(){
		System.out.println("LottoController 객체 생 성 !");
	}
	
	@Autowired
	private LottoService lottoService;
	
	@RequestMapping("/lotto.do")
	public String lottoProcess(LottoVO vo){
	
		if(lottoService.getResult(vo.getLottoNum()))
		{
			vo.setResult("추카추카");
		}else 
		{
			vo.setResult("아쉽네요 .. 재도전 하세요!!");
		}
		return "lottoView";
	}
	
}
