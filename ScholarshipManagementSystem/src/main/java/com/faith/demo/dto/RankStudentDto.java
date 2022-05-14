package com.faith.demo.dto;

import java.util.Date;

import com.faith.demo.entity.Student;

public class RankStudentDto {
	
	//instance variables
	private int studentId;
	private String studentName;
	private int applicationCode;
	private String courseName;
	private double average;
	private double credits;
	private int ranks;
	private Date approvedDate;
	
	//default constructor
	public RankStudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	//paramatrized constructor
	public RankStudentDto(int studentId, String studentName, int applicationCode, String courseName, double average,
			double credits, int ranks, Date approvedDate) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.applicationCode = applicationCode;
		this.courseName = courseName;
		this.average = average;
		this.credits = credits;
		this.ranks = ranks;
		this.approvedDate = approvedDate;
	}

	//getters and setters
	public int getStudentId() {
		return studentId;
	}

	//to string
	@Override
	public String toString() {
		return "RankStudentDto [studentId=" + studentId + ", studentName=" + studentName + ", applicationCode="
				+ applicationCode + ", courseName=" + courseName + ", average=" + average + ", credits=" + credits
				+ ", ranks=" + ranks + ", approvedDate=" + approvedDate + "]";
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getApplicationCode() {
		return applicationCode;
	}

	public void setApplicationCode(int applicationCode) {
		this.applicationCode = applicationCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public double getCredits() {
		return credits;
	}

	public void setCredits(double credits) {
		this.credits = credits;
	}

	public int getRanks() {
		return ranks;
	}

	public void setRanks(int ranks) {
		this.ranks = ranks;
	}

	public Date getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}
}
