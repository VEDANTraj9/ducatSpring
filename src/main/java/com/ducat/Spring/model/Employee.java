package com.ducat.Spring.model;

public class Employee {


	private String name, gender;
	private int id;
	
	private Address address;
	

	public Employee() {
		super();
		System.out.println("Employee.Employee()");
	}

	
	public Employee(String name, String gender, int id, Address address) {
		super();
		this.name = name;
		this.gender = gender;
		this.id = id;
		this.address = address;
		System.out.println("Employee.Employee(5)");
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Employee.setAddress()");
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Employee.setName()");
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
		System.out.println("Employee.setGender()");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Employee.setId()");
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", id=" + id + ", address=" + address + "]";
	}

	
}