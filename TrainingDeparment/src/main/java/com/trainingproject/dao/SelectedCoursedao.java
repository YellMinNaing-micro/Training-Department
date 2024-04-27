package com.trainingproject.dao;

import java.sql.SQLException;
import java.util.List;

import com.trainingproject.model.Course;
import com.trainingproject.model.CourseRegister;

public interface SelectedCoursedao {

void insertCourse(CourseRegister Course) throws SQLException;
CourseRegister selectCourse(int CourseId);
List<Course> getAllCourses();

double getCoursePrice(String courseName );
}
