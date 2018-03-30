package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.LottoDAO;


@Service
public class LottoService {
	public LottoService(){
		System.out.println("LottoService 객체 생성@");
	}
	@Autowired
	LottoDAO lottoDAO=null;
	public boolean getResult(int lottoNum){
		boolean result = false;
		lottoDAO = new LottoDAO();
		int randomNumber= lottoDAO.getLottoNumber();
		System.out.println("--난수 "+randomNumber);
		System.out.println("--입력한 수 "+lottoNum);
		
		if(randomNumber == lottoNum)
		{
			result=true;
		}
		return result;
	}
		
}
