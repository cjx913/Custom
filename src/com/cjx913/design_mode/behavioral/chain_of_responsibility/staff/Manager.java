package com.cjx913.design_mode.behavioral.chain_of_responsibility.staff;


import com.cjx913.design_mode.behavioral.chain_of_responsibility.Excuse;

public class Manager extends Staff {
	
	public Manager(String id,String name) {
		this.id=id;
		this.name=name;
		this.position = "经理";
		this.department = null;
	}
	
	public void setSuperior(Staff staff) {
		this.superior = staff;
	}

	@Override
	public void work() {
		System.out.println(this.name+"经理正在工作");
	}

	@Override
	public String handleLeave(Excuse excuse) {
		if(excuse.excuseDaies()>=10) {
			return superior.handleLeave(excuse);
		}
		return "同意";
	}

}
