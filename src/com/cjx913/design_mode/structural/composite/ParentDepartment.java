package com.cjx913.design_mode.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ParentDepartment extends Department {
	private List<Department> departments = new ArrayList<>();
	
	public ParentDepartment(String name) {
		this.name = name;
	}

	@Override
	public void add(Department department) {
		departments.add(department);
		
	}

	@Override
	public void remove(Department department) {
		departments.remove(department);
	}

	@Override
	public List<Department> getChildren() {
		return departments;
	}

	@Override
	public void sendFile() {
		System.out.println(name+"发送消息");
		for(Department department:departments) {
			department.sendFile();
		}
	}

}
