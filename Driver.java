package com.Department.mainapp;

import com.Department.model.AdminDepartment;
import com.Department.model.HrDepartment;
import com.Department.model.SuperDepartment;
import com.Department.model.TechDepartment;

public class Driver {
	public static void main(String[] args) {
		
		AdminDepartment admin=new AdminDepartment();
		System.out.println("welcome to"+" "+ admin.departmentName());
		System.out.println(admin.getTodaysWork());
	    System.out.println(admin.getWorkDeadline());
		SuperDepartment admindept= new AdminDepartment();
		System.out.println(admindept.isTodayAHoliday());
		System.out.println();
		
		HrDepartment hr=new HrDepartment();
		System.out.println("welcome to"+" "+ hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
	    SuperDepartment hrdept=new HrDepartment();
	    System.out.println(hrdept.isTodayAHoliday());
	    System.out.println();
	    
	    TechDepartment tech=new TechDepartment();
	    System.out.println("welcome to"+" "+tech.departmentName());
	    System.out.println(tech.getTodaysWork());
	    System.out.println(tech.getWorkDeadline());
	    System.out.println(tech.getTechStackInformation());
	    SuperDepartment techdept= new TechDepartment();
	    System.out.println(techdept.isTodayAHoliday());
	    System.out.println();
	}

}
