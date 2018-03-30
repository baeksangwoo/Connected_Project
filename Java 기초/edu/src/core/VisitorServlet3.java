package core;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.VisitorDAO;
import model.VisitorVO;


@WebServlet("/visitor3")
public class VisitorServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String find="";
		find=request.getParameter("search");
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out =response.getWriter();
		ArrayList<VisitorVO> list;
		if(find ==null){
			list = new VisitorDAO().list();
		}else{
			//System.out.println(find);
			list =new VisitorDAO().searchList(find);
		}
		for(VisitorVO vo : list){
			out.write(vo.getName());
			out.write(vo.getWriteDate());
			out.write(vo.getMemo()+"<br>");
		}

		out.print("<hr><a href='/edu/htmlexam/visitor.html' style=\"margin-right:20px\">방명록 작성하기</a>");
		out.print("<a href='/edu/visitor3'>방명록 전체보기</a>");
		out.print("<br><form method=\"get\" action=\"/edu/visitor3\"><input type=\"search\" name=\"search\" required> <button type=\"submit\">검색</button>");
		out.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("guestName");
		String memo=request.getParameter("opinion");
		VisitorDAO dao=new VisitorDAO();
		VisitorVO vo =new VisitorVO();
		vo.setName(name);
		vo.setMemo(memo);
		LocalDate localDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		vo.setWriteDate(localDate.format(formatter));

		boolean result=dao.insert(vo);
		PrintWriter out =response.getWriter();
		if(result){
			out.println("<h2>"+name+"님 글이 저장되었어요...</h2>");
		}else{
			out.println("<h2>"+name+"님!! 오류가 발생했어요...</h2>");
		}
		
		out.print("<a href='/edu/visitor3'> 방명록 리스트 보기</a>");
		out.close();
	}

}
