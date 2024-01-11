package com.cnts.service;

import java.util.List;

import com.cnts.bean.Employee;
import com.cnts.emplist.EmployeeList;

public class JoinedAfter2015 {
	
//	Get the names of all employees who have joined after 2015?
	public static void main(String[] args) {
		List<Employee> list =  new EmployeeList().emplist();
		
		list.stream().filter(year->year.getYearOfJoining()>2015).map(Employee::getName).forEach(System.out::println);
	}

}
