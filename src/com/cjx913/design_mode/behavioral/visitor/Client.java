package com.cjx913.design_mode.behavioral.visitor;

public class Client {

	public static void main(String[] args) {
		AwarderList awarderList = new AwarderList();
		for(int i=0;i<10;i++) {
			AAwarder awarder = null;
			if(i%2==0) {
				awarder = new StudentAwarder("s"+i, -3+i, 85+i);
			}else {
				awarder = new TeacherAwarder("t"+i, 5+i, 85+i);
			}
			awarderList.addAwarder(awarder);
		}
		
		awarderList.accept(new ArticleCheck());
		System.out.println("*******************************");
		awarderList.accept(new ScoreCheck());

	}

}
