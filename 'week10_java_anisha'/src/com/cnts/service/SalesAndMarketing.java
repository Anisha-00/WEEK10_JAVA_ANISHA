package com.cnts.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.cnts.bean.Employee;
import com.cnts.emplist.EmployeeList;

public class SalesAndMarketing {
	public static void main(String[] args) {
//		Number of male and female employees are there in the sales and marketing department
		List<Employee> list =  new EmployeeList().emplist();
		
		Map<String, Long> noOfMaleAndFemale = list.stream().filter(dept->dept.getDepartment()=="Sales" && dept.getDepartment()=="Marketing")
				.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		
		System.out.println(noOfMaleAndFemale);
	}

}
