package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.VisitorDAO;
import model.dao.VisitorMyBatisDAO;
import model.vo.VisitorVO;



@WebServlet("/visitor3")
public class VisitorServlet3 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	   List<VisitorVO> list = null;
	   if(request.getParameter("name") !=null ) list = new VisitorMyBatisDAO().listByName(request.getParameter("name"));
	   else list = new VisitorMyBatisDAO().list();
	   request.setAttribute("list",list);
	   request.getRequestDispatcher("/jspexam/visitorView.jsp").forward(request, response);   
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//HttpServlet이 가지고 있는 예외는 ServletException, IOException 밖에 없기 때문에 자손에서 doGet을 오버라이딩 할 때 이것 외에 추가적인 예외처리 할 수 없다.
		//try-catch사용

         request.setCharacterEncoding("utf-8");
		 
         String name = request.getParameter("name");
		 String memo = request.getParameter("feedback");
		 
		 VisitorMyBatisDAO dao = new VisitorMyBatisDAO();
		 VisitorVO vo = new VisitorVO();
		 vo.setName(name);
		 vo.setMemo(memo);
			
		request.setAttribute("msg","메세지");
	    request.setAttribute("dao",dao);
	    request.setAttribute("vo", vo);
		 
	    request.getRequestDispatcher("/jspexam/visitorView.jsp").forward(request, response); 
		 
	
	}

}
