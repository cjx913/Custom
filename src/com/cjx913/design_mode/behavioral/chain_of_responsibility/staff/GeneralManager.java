package com.cjx913.design_mode.behavioral.chain_of_responsibility.staff;


import com.cjx913.design_mode.behavioral.chain_of_responsibility.Excuse;

public class GeneralManager extends Staff {

	public GeneralManager(String id,String name) {
		this.id=id;
		this.name=name;
		this.position = "总经理";
		this.department = null;
	}

	@Override
	public void work() {
		System.out.println(this.name+"总经理正在工作");
	}

	@Override
	public String handleLeave(Excuse excuse) {
		if(excuse.excuseDaies()>30) {
			return "不同意，请假时间不能大于30天";
		}
		return "同意";
	}

}
