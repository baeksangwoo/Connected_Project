package dao;

import java.util.Random;

import org.springframework.stereotype.Repository;


@Repository
public class LottoDAO {

	public int getLottoNumber(){
		Random rand= new Random();
		return rand.nextInt(3)+1;
	}
	
}
