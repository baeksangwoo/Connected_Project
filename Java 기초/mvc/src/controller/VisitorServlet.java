package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.VisitorMyBatisDAO;
import model.vo.VisitorVO;


@WebServlet("/visitor")
public class VisitorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 List<VisitorVO> list = null;
		   if(request.getParameter("name") !=null ) 
			   list = new VisitorMyBatisDAO().listByName(request.getParameter("name"));
		   
		   else 
			   list = new VisitorMyBatisDAO().list();
		   request.setAttribute("list",list);
		   request.getRequestDispatcher("/jspexam/visitorView.jsp").forward(request, response);  
	}
			
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	       request.setCharacterEncoding("utf-8");
			 
	         String writer = request.getParameter("writer");
			 String title = request.getParameter("title");
			 String content =request.getParameter("content");
			 VisitorMyBatisDAO dao = new VisitorMyBatisDAO();
			 VisitorVO vo = new  VisitorVO();
			 vo.setName(writer);
			 vo.setWriteDate(title);
			 vo.setMemo(content);
			 dao.insert(vo);
		
		    request.getRequestDispatcher("/jspexam/visitorView.jsp").forward(request, response); 
		    
	}
}
