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

public class UpdateController extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("pageAction");
		SchoolService schoolService = new SchoolServiceImpl();
		if (action != null && action.equalsIgnoreCase("inpupUpdate")) {
			String userName = req.getParameter("userName");

			StudentModel s = schoolService.getStudent(userName);
			req.setAttribute("st", s);
			req.getRequestDispatcher("/studentUpdateInput.jsp").forward(req, resp);
		} else {
			String userName = req.getParameter("userName");
			String phno = req.getParameter("phno");
			String password = req.getParameter("password");

			StudentModel studentModel = new StudentModel();
			studentModel.setUserName(userName);
			studentModel.setPhno(phno);
			studentModel.setPassword(password);
			schoolService.updateStudent(studentModel);

			List<StudentModel> students = schoolService.getStudents();
			req.setAttribute("studentsList", students);
			req.getRequestDispatcher("scholldisplay.jsp").forward(req, resp);
		}

	}

}
