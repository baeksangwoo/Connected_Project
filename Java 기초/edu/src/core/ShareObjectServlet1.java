package core;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CountVO;


@WebServlet("/Share1")
public class ShareObjectServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CountVO vo= new CountVO();
		vo.setNumber(1000);
		request.setAttribute("count1", vo);
		request.getRequestDispatcher("/jspexam/countView1.jsp").forward(request, response);
	}

}
