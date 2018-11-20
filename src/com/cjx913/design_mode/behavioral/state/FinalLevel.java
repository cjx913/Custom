package com.cjx913.design_mode.behavioral.state;

public class FinalLevel extends ProfessionalLevel {

	public FinalLevel(Player player) {
		super(player);
	}

	@Override
	public void peekCards() {
		System.out.println("可以偷牌");
		super.peekCards();
	}

}
