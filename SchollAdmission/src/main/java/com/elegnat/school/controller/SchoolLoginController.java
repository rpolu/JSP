package com.elegnat.school.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.elegnat.school.model.StudentModel;
import com.elegnat.school.service.SchoolService;
import com.elegnat.school.service.impl.SchoolServiceImpl;

public class SchoolLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		SchoolService schoolService = new SchoolServiceImpl();
		boolean flag = schoolService.loginStudent(userName, password);
		if (!flag) {
			request.setAttribute("message", "Invalid Crendential. Please try again");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} else {
			List<StudentModel> students = schoolService.getStudents();
			request.setAttribute("studentsList", students);
			request.getRequestDispatcher("scholldisplay.jsp").forward(request, response);
		}
	}

}
