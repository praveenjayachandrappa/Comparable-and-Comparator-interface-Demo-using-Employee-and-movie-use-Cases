package com.test.sorting;

public class Employee implements Comparable<Employee>{

	private int eid;
	private String name;
	private double salary;
	private String address;
	
	//setting values through parametrised constructor
	
	public Employee(int eid, String name, double salary, String address) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	
	//getters
	
	public int getEid() {
		return eid;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public String getAddress() {
		return address;
	}

	@Override
	public int compareTo(Employee e) {

		//return this.eid-e.eid;
		
		return this.getName().compareTo(e.getName());
	}

}