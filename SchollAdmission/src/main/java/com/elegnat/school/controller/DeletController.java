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

public class DeletController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("userName");
		SchoolService schoolService = new SchoolServiceImpl();
		schoolService.deleteStudent(userName);
		List<StudentModel> students = schoolService.getStudents();
		request.setAttribute("studentsList", students);
		request.getRequestDispatcher("scholldisplay.jsp").forward(request, response);

	}
}
