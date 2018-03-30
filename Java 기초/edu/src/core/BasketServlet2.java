package core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/basket2")
public class BasketServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		if (session.getAttribute("cnt") == null) {
			session.setAttribute("cnt", new int[10]);
		}
		int session_v[] = (int[]) session.getAttribute("cnt");

		String command = request.getParameter("comm");

		if (command.equals("del")) {
			session.invalidate();
			/* session.removeAttribute("cnt"); 이렇게 해도 된다.*/ 
			out.print("<h1>상품이 모두 삭제되었습니다</h1><hr>");
			out.print("<br/><a href='/edu/htmlexam/productlog.html'>상품선택 화면</a>");
		} else {
			String productID = request.getParameter("productID");

			int id = Integer.parseInt(productID.split("p")[1]);
			session_v[id - 1]++;

			out.print("<h2>선택한 상품 리스트</h2>");
			out.print("<hr>");
			out.print("<ul>");

			for (int i = 0; i < 10; i++) {
				if (session_v[i] != 0)
					out.print("<li>p" + (i + 1) + " 상품 " + session_v[i] + "개</li>");
			}

			out.print("</ul>");
			out.print("<br/><a href='/edu/htmlexam/productlog.html'>상품선택 화면</a>");
			out.print("&nbsp&nbsp&nbsp");
			out.print("<a href='http://localhost:8000/edu/basket2?comm=del'>상품비우기</a>");

		}
		out.close();

	}

}
