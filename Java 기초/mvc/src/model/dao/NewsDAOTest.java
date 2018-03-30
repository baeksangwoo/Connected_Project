package model.dao;

import java.util.ArrayList;

import org.junit.Test;

import model.vo.NewsVO;

public class NewsDAOTest {

	@Test
	public void dbTest() {
		NewsDAO dao = new NewsDAO();
		NewsVO vo=new NewsVO();
		/*vo.setWriter("둘리");
		vo.setTitle("헤키헤키요~");
		vo.setContent("Boys Be ambitious ");
		dao.insert(vo);*/
		int num=3;
		//dao.delete(num);
		
		System.out.println(dao.listOne(num));
		ArrayList<NewsVO> myList= dao.listAll();
		System.out.println(myList.size());
		for(NewsVO data: myList){
			System.out.println(data);
		}
	
	}

}
