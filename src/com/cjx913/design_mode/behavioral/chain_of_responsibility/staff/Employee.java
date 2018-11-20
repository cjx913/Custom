package com.cjx913.design_mode.behavioral.chain_of_responsibility.staff;

import com.cjx913.design_mode.behavioral.chain_of_responsibility.Excuse;
import com.cjx913.design_mode.behavioral.chain_of_responsibility.Image;

import java.util.Date;
import java.util.Set;


public class Employee extends Staff {

	@Override
	public void work() {
		System.out.println(this.name+"员工正在工作");

	}

	@Override
	public String handleLeave(Excuse excuse) {
		return superior.handleLeave(excuse);
	}
	
	public Excuse writeExcuse(String id,Date startDate,Date endDate,String reason,Set<Image> evidences) {
		return new Excuse(id, this, startDate, endDate, reason, evidences);
	}

}
