package com.cjx913.design_mode.behavioral.state;

public class SecondaryLevel extends PrimaryLevel {

	public SecondaryLevel(Player player) {
		super(player);
	}

	@Override
	public void doubleScore() {
		System.out.println("双倍得分");
		super.doubleScore();
	}
	
	

	

}
