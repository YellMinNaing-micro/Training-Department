package com.trainingproject.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface JDBCutils {
	public class JDBCUtils {

		private static String jdbcURL = "jdbc:mysql://localhost:3306/training";
		private static String jdbcUsername = "root";
		private static String jdbcPassword = "2874";

		public static Connection getConnection() {
			Connection connection = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
			} catch (SQLException e) {
// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return connection;
		}
	}
}