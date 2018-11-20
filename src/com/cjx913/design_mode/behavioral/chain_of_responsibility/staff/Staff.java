package com.cjx913.design_mode.behavioral.chain_of_responsibility.staff;


import com.cjx913.design_mode.behavioral.chain_of_responsibility.Excuse;
import com.cjx913.design_mode.behavioral.chain_of_responsibility.department.Department;

public abstract class Staff {
	protected String id;
	protected String name;
	protected Department department;
	protected String position;
	protected Staff superior;
	
	public abstract void work();
	public abstract String handleLeave(Excuse excuse);
}
