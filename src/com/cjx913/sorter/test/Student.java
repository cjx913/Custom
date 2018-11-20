package com.cjx913.sorter.test;

public class Student implements Comparable<Student> {
	
	private String name;
	private int score;
	
	public Student(String name, int i) {
		super();
		this.name = name;
		this.score = i;
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getscore() {
		return score;
	}



	public void setscore(int score) {
		this.score = score;
	}
	
	
	



	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]\n";
	}

	@Override
	public int compareTo(Student o) {
		return this.getscore()-o.getscore();
	}

}
