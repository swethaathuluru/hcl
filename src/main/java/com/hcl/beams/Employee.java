package com.hcl.beams;

public class Employee {
	private int id;
	 private String name;
	 private String department;
	 private int salary;
	 
	 
	 

	public Employee() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "empl [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
