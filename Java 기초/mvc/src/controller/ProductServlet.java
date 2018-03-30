package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.vo.ProductVO;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/fruit")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		String id = request.getParameter("pid");
		PrintWriter out=response.getWriter();
		HttpSession session = request.getSession();
		if(session.getAttribute("cnt")==null){
			session.setAttribute("cnt",new ProductVO());
		}
		ProductVO session_v = (ProductVO)session.getAttribute("cnt");
		
		if(id.equals("p001"))
		{
			session_v.setBanana(1);
			request.setAttribute("cnt", session_v);
		}
		else if(id.equals("p002"))
		{
			session_v.setApple(1);
			request.setAttribute("cnt", session_v);
		}
		else if(id.equals("p003"))
		{
			session_v.setOrange(1);
			request.setAttribute("cnt", session_v);
		}
		else if(id.equals("clean"))
		{
			int banana=session_v.getBanana();
			int apple=session_v.getApple();
			int orange=session_v.getOrange();
			
			session_v.setApple(-apple);
			session_v.setOrange(-orange);
			session_v.setBanana(-banana);
			request.setAttribute("cnt", session_v);
		}
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jspexam/productView.jsp"); //넘길 페이지 주소
		dispatcher.forward(request, response);
		
	}

}
