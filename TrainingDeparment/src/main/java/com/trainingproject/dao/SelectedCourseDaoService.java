package com.trainingproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.trainingproject.model.Course;
import com.trainingproject.model.CourseRegister;
import com.trainingproject.utils.EmailSendUtils;
import com.trainingproject.utils.JDBCutils.JDBCUtils;
import com.trainingproject.utils.ReadSheetUtils;
import java.util.List;

public class SelectedCourseDaoService implements SelectedCoursedao {

	private static final String INSERT_CourseS_SQL = "INSERT INTO Coursetb"
			+ "  (username, emailid, coursename,price) VALUES " + " (?, ?, ?, ?);";

	private static final String SELECT_Course_BY_ID = "select * from Coursetb where id =?";

	public void insertCourse(CourseRegister Course) throws SQLException {
		System.out.println(INSERT_CourseS_SQL);
// try-with-resource statement will auto close the connection.
		try (Connection connection = JDBCUtils.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CourseS_SQL)) {
			preparedStatement.setString(1, Course.getUserName());
			preparedStatement.setString(2, Course.getEmailId());
			preparedStatement.setString(3, Course.getCourseName());
			preparedStatement.setDouble(4, Course.getPrice());
//preparedStatement.setInt(5, Course.getstatus());
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
			new EmailSendUtils().SendEmail(Course.getEmailId(), Course.getCourseName()); // after inserted send mail to
																							// particular users
		} catch (SQLException exception) {
			System.out.print(exception);
		}
	}

	public CourseRegister selectCourse(int CourseId) {
		CourseRegister Course = null;
// Step 1: Establishing a Connection
		try (Connection connection = JDBCUtils.getConnection();
// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_Course_BY_ID);) {
			preparedStatement.setLong(1, CourseId);
			System.out.println(preparedStatement);
// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

// Step 4: Process the ResultSet object.

			while (rs.next()) {
				int id = rs.getInt("id");
				String username = rs.getString("username");
				String emailid = rs.getString("emailid");
				String coursename = rs.getString("coursename");
				double price = rs.getLong("price");
				Course = new CourseRegister(id, username, emailid, coursename, price);
			}
		} catch (SQLException exception) {
			System.out.println(exception);
		}
		return Course;
	}

	public List<Course> getAllCourses() {

		return ReadSheetUtils.ReadCourse("D:\\CIA\\training.xlsx"); // calling excel sheet Path..
	}

	public double getCoursePrice(String courseName) // get the price from excel sheet.
	{
		List<Course> listerCourse = getAllCourses();

		for (Course currentCourse : listerCourse) {
			if (currentCourse.getCourseName().equalsIgnoreCase(courseName)) // check courseName
				return currentCourse.getPrice();
		}
		return 0;
	}
}
