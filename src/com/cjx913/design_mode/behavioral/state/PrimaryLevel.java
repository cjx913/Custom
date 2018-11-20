package com.cjx913.design_mode.behavioral.state;

public class PrimaryLevel extends Level {
	
	public PrimaryLevel(Player player) {
		super(player);
	}

	@Override
	public void play() {
		int i= (int) (Math.random()*100%3);
		if(i==0) {
			System.out.println("平手");
			player.setScore(player.getScore()+50);
		}else if (i==1) {
			System.out.println("赢了");
			player.setScore(player.getScore()+150);
		}else {
			System.out.println("输了");
			player.setScore(player.getScore()-100);
		}
		super.play();
	}

}
