package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.vo.MemberVO;

@WebServlet("/member")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");

		String name=request.getParameter("guestName");
		String telphone=request.getParameter("telphone");
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		
		
		MemberVO vo=new MemberVO();
		
		vo.setName(name);
		vo.setTelphone(telphone);
		vo.setId(id);
		vo.setPassword(password);
		request.setAttribute("member", vo);
		request.getRequestDispatcher("/jspexam/memberView.jsp").forward(request, response);
	}

}
