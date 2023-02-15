package com.in.exam;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "next.do", urlPatterns = { "/next.do" })
public class NextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().print("<html><head><title>처음으로 만들어 보는 서블릿</title></head>");
		response.getWriter().print("<body>");
		response.getWriter().print("헬로우 서블릿<br>");
		response.getWriter().print("<a href='hello.do'>이전으로</a>");
		
		response.getWriter().print("</body><html>");
		
	}

}
