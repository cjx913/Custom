package com.cjx913.design_mode.behavioral.visitor;

public class ScoreCheck extends AAwardCheck {

	@Override
	public void visit(StudentAwarder awarder) {
		if (awarder.getScore()>=90) {
			System.out.println(awarder.getName()+"获得成绩优秀奖");
		}
	}

	@Override
	public void visit(TeacherAwarder teacherAwarder) {
		if (teacherAwarder.getScore()>=90) {
			System.out.println(teacherAwarder.getName()+"获得成绩优秀奖");
		}

	}

}
