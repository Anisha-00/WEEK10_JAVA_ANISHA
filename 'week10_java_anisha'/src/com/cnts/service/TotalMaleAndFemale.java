package com.cnts.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.cnts.bean.Employee;
import com.cnts.emplist.EmployeeList;

public class TotalMaleAndFemale {

	public static void main(String[] args) {

		List<Employee> list =  new EmployeeList().emplist();
		
		Map<String , Long> totalMaleAndFemale = list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(totalMaleAndFemale);
	}
}
