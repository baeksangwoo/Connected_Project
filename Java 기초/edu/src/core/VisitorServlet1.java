package core;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VisitorServlet1
 */
@WebServlet("/visitor1")
public class VisitorServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8"); //post 방식에서는 
		PrintWriter out =response.getWriter();
		String userName =request.getParameter("guestName");
		LocalDate localDate = LocalDate.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		
		String opinion = request.getParameter("opinion");
		out.print("<h1>"+userName+"님이 "+localDate.format(formatter)+"에 남긴 글입니다.</h1>");
		out.print("<h1>"+opinion+"</h1>");
		out.print("<a href='/edu/htmlexam/visitor.html'>"+"입력화면으로 가기</a>");
		out.close();
	}
}
