package com.cjx913.design_mode.structural.composite;

public class Client {
	public static void main(String[] args) {
		Department office1 = new SubDepartment("教务办公室");
		Department office2 = new SubDepartment("行政办公室");
		
		Department department = new ParentDepartment("北京总部");
		Department department1 = new ParentDepartment("湖南分校");
		department.add(office1);
		department.add(office2);
		department.add(department1);
		
		
		
		Department department3 = new ParentDepartment("长沙教学点");
		department3.add(office1);
		department3.add(office2);
		Department department4 = new ParentDepartment("湘潭教学点");
		department4.add(office1);
		department4.add(office2);
		
		department1.add(department3);
		department1.add(department4);
		department1.add(office1);
		department1.add(office2);
		
		department.sendFile();
		
//		office1.add(department4);
		
		
	}
}
