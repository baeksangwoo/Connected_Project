package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/edupost")
public class EduServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8"); //post 방식에서는 
		String content =request.getParameter("guestName");
		int number = Integer.parseInt(request.getParameter("num"));
		
		request.setAttribute("content", content); //유저의 이름만 필요
 
       
		if(number>=90)
		{
			   	ServletContext context =getServletContext();
		        RequestDispatcher dispatcher = context.getRequestDispatcher("/jspexam/gradeA.jsp"); //넘길 페이지 주소
		        dispatcher.forward(request, response);
		}
		else if(number>=80 && number<=89)
		{
		 	ServletContext context =getServletContext();
	        RequestDispatcher dispatcher = context.getRequestDispatcher("/jspexam/gradeB.jsp"); //넘길 페이지 주소
	        dispatcher.forward(request, response);
		}
		else if(number>=70 && number<=79)
		{
		 	ServletContext context =getServletContext();
	        RequestDispatcher dispatcher = context.getRequestDispatcher("/jspexam/gradeC.jsp"); //넘길 페이지 주소
	        dispatcher.forward(request, response);
		}
		else
		{
		 	ServletContext context =getServletContext();
	        RequestDispatcher dispatcher = context.getRequestDispatcher("/jspexam/gradeD.jsp"); //넘길 페이지 주소
	        dispatcher.forward(request, response);
		}
		
		  // Random() 객체 생성
	}

}
