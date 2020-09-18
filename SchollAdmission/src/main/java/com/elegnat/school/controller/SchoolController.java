package com.elegnat.school.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.elegnat.school.model.StudentModel;
import com.elegnat.school.service.SchoolService;
import com.elegnat.school.service.impl.SchoolServiceImpl;

public class SchoolController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentModel studentModel = getDataModel(req);
		SchoolService schoolService = new SchoolServiceImpl();
		schoolService.saveStudent(studentModel);
		req.setAttribute("message", "User Registation success. Please login here");
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}

	private StudentModel getDataModel(HttpServletRequest req) {
		// Capture the Data from JSP
		String rollNum = req.getParameter("rollNum");
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String email = req.getParameter("email");
		String phno = req.getParameter("phno");
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		String gender = req.getParameter("gender");
		String knownLanguages = req.getParameter("knownLanguages");
        // Create the Model class object
		StudentModel studentModel = new StudentModel();

		// Populate the Data to Model
		studentModel.setRollNum(rollNum);
		studentModel.setFirstName(firstName);
		studentModel.setLastName(lastName);
		studentModel.setEmail(email);
		studentModel.setPhno(phno);
		studentModel.setUserName(userName);
		studentModel.setPassword(password);
		studentModel.setGender(gender);
		studentModel.setKnownLanguages(knownLanguages);
		return studentModel;
	}

}
