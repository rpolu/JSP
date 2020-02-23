package com.elegant;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ss")
public class AddingServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
		
		String n1 = req.getParameter("n1");
		String n2 = req.getParameter("n2");
		int a = Integer.parseInt(n1);
		int b = Integer.parseInt(n2);
		int result = a / b;
		resp.getWriter().print(result);
		}catch (Exception e) {
			req.getRequestDispatcher("/error.jsp").forward(req, resp);
		}
	}

}
