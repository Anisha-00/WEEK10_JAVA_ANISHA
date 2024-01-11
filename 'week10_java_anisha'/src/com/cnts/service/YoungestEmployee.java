package com.cnts.service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.cnts.bean.Employee;
import com.cnts.emplist.EmployeeList;

public class YoungestEmployee {

	public static void main(String[] args) {
//		Get the youngest employee details each department wise (By Using Optional)
		List<Employee> list =  new EmployeeList().emplist();
		
		Map<String, Optional<Employee>> youngestEmployee = list.stream().collect((Collectors.groupingBy(Employee::getDepartment,Collectors.minBy(Comparator.comparing(Employee::getAge)))));
		System.out.println(youngestEmployee);
		
	}
}
