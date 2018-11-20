package com.cjx913.design_mode.behavioral.visitor;

public abstract class AAwardCheck {
	public abstract void visit(StudentAwarder awarder) ;
	public abstract void visit(TeacherAwarder teacherAwarder);
}
