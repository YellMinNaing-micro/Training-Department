package com.trainingproject.model;

public class CourseRegister {
	private int id;
	private String userName;
	private String emailId;
	private String courseName;
	private double price;

	public CourseRegister(String userName, String emailId, String courseName, double price) {
		super();
		this.userName = userName;
		this.emailId = emailId;
		this.courseName = courseName;
		this.price = price;

	}

	public CourseRegister(int id, String userName, String emailId, String courseName, double price) {
		super();
		this.id = id;
		this.userName = userName;
		this.emailId = emailId;
		this.courseName = courseName;
		this.price = price;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
