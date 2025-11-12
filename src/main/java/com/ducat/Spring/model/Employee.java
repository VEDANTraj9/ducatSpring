package com.ducat.Spring.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

//	Instance var / attributes / Properties 
	private String name, gender;
	private int id;

	private Address address;

	List<Integer> list;

	Set<Integer> set;

	Map<Integer, String> map;

	public Employee() {
		super();
		System.out.println("Employee.Employee()");
	}

	public Employee(String name, String gender, int id, Address address, List<Integer> list, Set<Integer> set,
			Map<Integer, String> map) {
		super();
		this.name = name;
		this.gender = gender;
		this.id = id;
		this.address = address;
		this.list = list;
		this.set = set;
		this.map = map;
	}

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	public Set<Integer> getSet() {
		return set;
	}

	public void setSet(Set<Integer> set) {
		this.set = set;
	}

	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
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
		return "Employee [name=" + name + ", gender=" + gender + ", id=" + id + ", address=" + address + ", list="
				+ list + ", set=" + set + ", map=" + map + "]";
	}

}