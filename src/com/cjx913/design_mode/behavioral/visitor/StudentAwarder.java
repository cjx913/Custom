package com.cjx913.design_mode.behavioral.visitor;

public class StudentAwarder extends AAwarder {

	public StudentAwarder(String name, int articleCount, int score) {
		super(name, articleCount, score);
	}

	@Override
	public void accept(AAwardCheck awardCheck) {
		awardCheck.visit(this);
	}

	

}
