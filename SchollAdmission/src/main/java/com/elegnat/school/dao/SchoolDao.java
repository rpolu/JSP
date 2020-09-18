package com.elegnat.school.dao;

import java.util.List;

import com.elegnat.school.model.StudentModel;

public interface SchoolDao {
	public void saveStudent(StudentModel studentModel);

	public boolean loginStudent(String userName, String password);

	public StudentModel getStudent(String userName);

	public List<StudentModel> getStudents();

	public void updateStudent(StudentModel studentModel);

	public void deleteStudent(String userName);
}
