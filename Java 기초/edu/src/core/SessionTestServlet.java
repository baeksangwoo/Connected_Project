package core;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessiontest")
public class SessionTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");//서블릿의 응답은 html이면서 utf-8방식이다.
		PrintWriter out= response.getWriter();
		HttpSession session=request.getSession();
		String command= request.getParameter("comm");
		String msg="";
		long time = session.getCreationTime();
		if(command.equals("view")){
			if(session.isNew())
			{
				msg="세션 객체 생성:";
			}
			else{
				msg="세션 객체 추출:";
			}
			msg+="(id: "+session.getId()+",time: "+new Date(time);
		}else if (command.equals("delete"))
		{
			session.invalidate();
			msg="세션 객체 삭제";
		
		}else {
			msg="요청시 comm =view 또는 comm=delete 를 "+"전달해주세요!!";
		}
		out.println("<h1>"+msg+"</h1>");
		out.close();
	}

}
