package com.trainingproject.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.List;
import com.trainingproject.model.Course;

public class ReadSheetUtils {

	@SuppressWarnings("deprecation")
	public static List<Course> ReadCourse(String path) {
		List<Course> courseList = new ArrayList<Course>(); // Array list
		try {
			File file = new File(path);
			// creating a new file instance
			FileInputStream fis = new FileInputStream(file);
			try (// obtaining bytes from the file
					// creating Workbook instance that refers to .xlsx file
					XSSFWorkbook wb = new XSSFWorkbook(fis)) {
				XSSFSheet sheet = wb.getSheetAt(0);
				// creating a Sheet object to retrieve object
				Iterator<Row> itr = sheet.iterator();
				int count = 0;
				// iterating over excel file
				while (itr.hasNext()) {
					Row row = itr.next();
					Iterator<Cell> cellIterator = row.cellIterator();
					String coursename = "";
					double price = 0;
					count = count + 1;
					if (count == 1) {
						continue;
					}
					// iterating over each column
					while (cellIterator.hasNext()) {

						Cell cell = cellIterator.next();
						switch (cell.getCellType()) {
						case Cell.CELL_TYPE_STRING: // string value in coursename
							coursename = cell.getStringCellValue();
							break;
						case Cell.CELL_TYPE_NUMERIC: // numberic value in price
							price = cell.getNumericCellValue();

							break;
						default:
						}
					}
					// System.out.println(coursename+" "+price);
					courseList.add(new Course(coursename, price));

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return courseList;
	}
}
