package com.trainingproject.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import com.trainingproject.dao.SelectedCoursedao;
import com.trainingproject.dao.SelectedCourseDaoService;

@WebServlet("/")
public class TrainingSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SelectedCoursedao courseDAO;
	private TrainingSessionController sessionController;

	public TrainingSessionServlet() {
		super();
		courseDAO = new SelectedCourseDaoService();
		sessionController = new TrainingSessionController(courseDAO);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		try {
			switch (action) {
			case "/new":
				sessionController.showNewForm(request, response);
				break;
			case "/insert":
				sessionController.insertCourse(request, response);
				break;

			default:
				RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");// calling index.jsp
				dispatcher.forward(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
// Course Auto-generated method stub
		doGet(request, response);
	}
}