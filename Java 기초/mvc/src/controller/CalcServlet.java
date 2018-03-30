package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calserv")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		int num1 = Integer.parseInt(request.getParameter("num1"));
		String content =request.getParameter("tool");
		int num2 = Integer.parseInt(request.getParameter("num2"));
		int sum=0;
		if(content.equals("plus"))
		{
			sum=num1+num2;
			request.setAttribute("sum", sum); //유저의 이름만 필요
		}
		else if(content.equals("minus"))
		{
			sum=num1-num2;
			request.setAttribute("sum", sum); //유저의 이름만 필요
		}
		else if(content.equals("multiple"))
		{
			sum=num1*num2;	
			request.setAttribute("sum", sum); //유저의 이름만 필요
		}
		else if(content.equals("division"))
		{
			
			if(num2==0)
			{
				System.out.println("오류");
				content="나눗셈 연산시 두 번째 숫자는 0일 수 없습니다.";
				request.setAttribute("sum", content); //유저의 이름만 필요
			}
			else
			{
				sum=num1/num2;
				request.setAttribute("sum", sum); //유저의 이름만 필요
				System.out.println(sum);
			}
		}
		else if(content.equals("rest"))
		{
			sum=num1%num2;
			request.setAttribute("sum", sum); //유저의 이름만 필요
			System.out.println(sum);
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jspexam/news.jsp"); //넘길 페이지 주소
		dispatcher.forward(request, response);
		
	}

}
