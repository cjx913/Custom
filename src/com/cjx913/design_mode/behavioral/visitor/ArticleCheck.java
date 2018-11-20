package com.cjx913.design_mode.behavioral.visitor;

public class ArticleCheck extends AAwardCheck {

	@Override
	public void visit(StudentAwarder awarder) {
		if(awarder.getArticleCount()>2) {
			System.out.println(awarder.getName()+"获得科研奖");
		}

	}

	@Override
	public void visit(TeacherAwarder teacherAwarder) {
		if(teacherAwarder.getArticleCount()>10) {
			System.out.println(teacherAwarder.getName()+"获得科研奖");
		}

	}

}
