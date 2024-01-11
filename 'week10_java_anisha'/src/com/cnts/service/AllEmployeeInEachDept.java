package com.cnts.service;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import com.cnts.bean.Employee;
import com.cnts.emplist.EmployeeList;

public class AllEmployeeInEachDept {

	public static void main(String[] args) {
//		List down the names of all employees in each department?
		
		List<Employee> list =  new EmployeeList().emplist();
		
		Map<String, List<Employee>> listOfEmpByDept = list.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		Set<Entry<String, List<Employee>>> entrySet = listOfEmpByDept.entrySet();
		for(Entry<String, List<Employee>> entry : entrySet) {
			
			System.out.println("Department Name: "+entry.getKey());
			
			List<Employee> emplist = entry.getValue();
			for(Employee employee : emplist) {
				System.out.println(employee.getName());
			}
		}
	}
}
