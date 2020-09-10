package com.elegnat.school.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.elegnat.school.dao.SchoolDao;
import com.elegnat.school.model.StudentModel;
import com.elegnat.school.util.ConnectionsUtils;

public class SchoolDaoImpl implements SchoolDao {
	private static final String DELETE_STUDENT = "DELETE FROM  SCHOOL_ADMIN WHERE USERNAME = ?";
	private static final String LOGIN_STUDENT = "SELECT * FROM  SCHOOL_ADMIN WHERE USERNAME = ?  PASSWORD= ?";
	private static final String GET_STUDENT = "SELECT * FROM  SCHOOL_ADMIN WHERE USERNAME = ?";
	private static final String GET_STUDENTS = "SELECT * FROM  SCHOOL_ADMIN";

	public void saveStudent(StudentModel studentModel) {

	}

	public boolean loginStudent(String userName, String password) {
		boolean isUserExist = false;
		PreparedStatement pst = null;
		ResultSet rs = null;
		Connection connection = ConnectionsUtils.getConnection();
		try {
			pst = connection.prepareStatement(LOGIN_STUDENT);
			pst.setString(1, userName);
			pst.setString(2, password);
			rs = pst.executeQuery();
			if (rs.next()) {
				isUserExist = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			ConnectionsUtils.closeConnection();
		}
		return isUserExist;
	}

	public StudentModel getStudent(String userName) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		Connection connection = ConnectionsUtils.getConnection();
		StudentModel studentModel = null;
		try {
			pst = connection.prepareStatement(GET_STUDENT);
			pst.setString(1, userName);
			rs = pst.executeQuery();
			if (rs.next()) {
				studentModel = new StudentModel();
				studentModel.setRollNum(rs.getString("RollNUM"));
				studentModel.setFirstName(rs.getString("FIRSTNAME"));
				studentModel.setLastName(rs.getString("LASTNAME"));
				studentModel.setEmail(rs.getString("EMAIL"));
				studentModel.setPhno(rs.getString("PHNO"));
				studentModel.setGender(rs.getString("GENDER"));
				studentModel.setKnownLanguages(rs.getString("KNOWNLANGUAGES"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			ConnectionsUtils.closeConnection();
		}
		return studentModel;
	}

	public List<StudentModel> getStudents() {
		PreparedStatement pst = null;
		ResultSet rs = null;
		Connection connection = ConnectionsUtils.getConnection();
		List<StudentModel> studentModels = new ArrayList<StudentModel>();
		try {
			pst = connection.prepareStatement(GET_STUDENTS);
			rs = pst.executeQuery();
			while (rs.next()) {
				StudentModel studentModel = new StudentModel();
				studentModel.setRollNum(rs.getString("RollNUM"));
				studentModel.setFirstName(rs.getString("FIRSTNAME"));
				studentModel.setLastName(rs.getString("LASTNAME"));
				studentModel.setEmail(rs.getString("EMAIL"));
				studentModel.setPhno(rs.getString("PHNO"));
				studentModel.setGender(rs.getString("GENDER"));
				studentModel.setKnownLanguages(rs.getString("KNOWNLANGUAGES"));
				studentModels.add(studentModel);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			ConnectionsUtils.closeConnection();
		}
		return studentModels;
	}

	public void updateStudent(StudentModel studentModel) {

	}

	public void deleteStudent(String userName) {
		PreparedStatement pst = null;
		Connection connection = ConnectionsUtils.getConnection();
		try {
			pst = connection.prepareStatement(DELETE_STUDENT);
			pst.setString(1, userName);
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			ConnectionsUtils.closeConnection();
		}
	}
}
