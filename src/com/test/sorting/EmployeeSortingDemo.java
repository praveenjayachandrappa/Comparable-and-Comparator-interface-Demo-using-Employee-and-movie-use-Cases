package com.test.sorting;

import java.util.Arrays;

public class EmployeeSortingDemo {

	public static void main(String[] args) {
		
		Employee e1=new Employee(100, "andy", 50000, "bng");
		Employee e2=new Employee(101, "bob", 60000, "hyd");
		Employee e3=new Employee(102, "charile", 65000, "bng");
		Employee e4=new Employee(103, "asha", 80000, "uk");
		Employee e5=new Employee(99, "maxwell", 95000, "us");
		String e;
		Employee empArray[]=new Employee[5];
		
		empArray[0]=e1;
		empArray[1]=e2;
		empArray[2]=e3;
		empArray[3]=e4;
		empArray[4]=e5;
		
		Arrays.sort(empArray);
		for (Employee employee : empArray) {
		
			System.out.println(employee.getName()+" : "+employee.getEid());
		}
		
		System.out.println("Sorting based on employee salries using comparator logic");
		Arrays.sort(empArray, new SalaryComparator());
		System.out.println("----------------------------------------------");
		for (Employee employee : empArray) {
			
			System.out.println(employee.getName()+" "+employee.getSalary());
		}
	}
}
