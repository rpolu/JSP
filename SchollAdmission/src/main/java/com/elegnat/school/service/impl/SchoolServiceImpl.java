package com.elegnat.school.service.impl;

import java.util.List;

import com.elegnat.school.dao.SchoolDao;
import com.elegnat.school.dao.impl.SchoolDaoImpl;
import com.elegnat.school.model.StudentModel;
import com.elegnat.school.service.SchoolService;

public class SchoolServiceImpl implements SchoolService {

	private SchoolDao schoolDao = new SchoolDaoImpl();

	public void saveStudent(StudentModel studentModel) {
		schoolDao.saveStudent(studentModel);
	}

	public boolean loginStudent(String userName, String password) {
		return schoolDao.loginStudent(userName, password);
	}

	public StudentModel getStudent(String userName) {
		return schoolDao.getStudent(userName);
	}

	public List<StudentModel> getStudents() {
		return schoolDao.getStudents();
	}

	public void updateStudent(StudentModel studentModel) {
		schoolDao.updateStudent(studentModel);
	}

	public void deleteStudent(String userName) {
		schoolDao.deleteStudent(userName);
	}
}
