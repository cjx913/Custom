package com.cjx913.design_mode.behavioral.state;

public class ProfessionalLevel extends SecondaryLevel {
	public ProfessionalLevel(Player player) {
		super(player);
	}

	@Override
	public void changeCards() {
		System.out.println("可以换牌");
		super.changeCards();
	}
	
	

}
