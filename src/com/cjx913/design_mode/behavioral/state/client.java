package com.cjx913.design_mode.behavioral.state;

public class client {
	public static void main(String[] args) {
		Player player = new Player("cjx913", 2950);
		for(int i=0;i<10;i++) {
			player.play();
			player.doubleScore();
			player.changeCards();
			player.peekCards();
			System.out.println(player.getScore());
		}
		
	}
}
