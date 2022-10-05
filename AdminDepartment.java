package com.Department.model;

public class AdminDepartment extends SuperDepartment {
	public String departmentName() {
		return "Admin department";
	}
	public String getTodaysWork() {
		return "Completer your document submission";
	}
	public String getWorkDeadline() {
		return "Complete by EOD" ;
		
	}

}