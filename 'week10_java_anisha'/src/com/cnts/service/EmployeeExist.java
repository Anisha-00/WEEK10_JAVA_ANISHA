package com.cnts.service;

import java.util.List;
import java.util.Scanner;

import com.cnts.bean.Employee;
import com.cnts.emplist.EmployeeList;

public class EmployeeExist {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		List<Employee> list =  new EmployeeList().emplist();
		
		if(list.stream().filter(e->e.getName().equalsIgnoreCase(name))!=null) {
			System.out.println("Existe");
		}
		else {
			System.out.println("Not Existe");
		}
		sc.close();
	}
}
