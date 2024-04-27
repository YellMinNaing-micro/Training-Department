package com.trainingproject.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trainingproject.dao.SelectedCoursedao;
import com.trainingproject.model.Course;
import com.trainingproject.model.CourseRegister;

public class TrainingSessionController {

	private SelectedCoursedao courseDAO;

	TrainingSessionController(SelectedCoursedao _courseDAO) {
		courseDAO = _courseDAO;
	}

	public void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Course> listCourse = courseDAO.getAllCourses();// get all courses from excel sheet from Dao assign to array
															// list
		request.setAttribute("listCourse", listCourse);
		RequestDispatcher dispatcher = request.getRequestDispatcher("register.jsp");// calling course-register.jsp
		dispatcher.forward(request, response);
	}

	public void insertCourse(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		String username = request.getParameter("username");
		String emailid = request.getParameter("emailid");
		String coursename = request.getParameter("coursename");

		double price = courseDAO.getCoursePrice(coursename);
		CourseRegister newCourse = new CourseRegister(username, emailid, coursename, price);
		courseDAO.insertCourse(newCourse);
		RequestDispatcher dispatcher = request.getRequestDispatcher("thankyou.jsp");
		request.setAttribute("Course", newCourse);
		dispatcher.forward(request, response);
	}
}