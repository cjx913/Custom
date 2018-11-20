package com.cjx913.design_mode.structural.composite;

import java.util.List;

public abstract class Department {
	protected String name;
	public abstract void add(Department department);
	public abstract void remove(Department department);
	public abstract List<Department> getChildren();
	public abstract void sendFile();
}
