package com.cjx913.design_mode.structural.composite;

import java.util.List;
import java.util.Set;

public class SubDepartment extends Department {
	
	public SubDepartment(String name) {
		this.name = name;
	}

	@Override
	public void add(Department department) {
		try {
			throw new Exception("没有子部门");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void remove(Department department) {
		try {
			throw new Exception("没有子部门");
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
	}

	@Override
	public List<Department> getChildren() {
		try {
			throw new Exception("没有子部门");
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return null;
	}

	@Override
	public void sendFile() {
		System.out.println(name+"收到文件");
	}

}
