package com.cjx913.design_mode.behavioral.chain_of_responsibility.department;

import java.util.Set;

import com.cjx913.design_mode.behavioral.chain_of_responsibility.staff.Director;
import com.cjx913.design_mode.behavioral.chain_of_responsibility.staff.Employee;

public abstract class Department {
	protected String id;
	protected String name;
	protected Director director;
	protected Set<Employee> employees;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
	
}
