package com.cjx913.design_mode.behavioral.chain_of_responsibility.staff;


import com.cjx913.design_mode.behavioral.chain_of_responsibility.Excuse;
import com.cjx913.design_mode.behavioral.chain_of_responsibility.department.Department;

public class Director extends Staff {
	
	public Director(String id, String name, Department department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}

	@Override
	public void work() {
		System.out.println(this.name+"部门主任正在工作");
	}

	@Override
	public String handleLeave(Excuse excuse) {
		if(excuse.excuseDaies()>3) {
			return superior.handleLeave(excuse);
		}
		return "同意";
	}

}
