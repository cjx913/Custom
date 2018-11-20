package com.cjx913.design_mode.behavioral.state;

public class Level {
	protected Player player;
	
	public Level(Player player) {
		this.player = player;
	}
	
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public  void play() {stateCheck();}
	public  void doubleScore() {stateCheck();}
	public  void changeCards() {stateCheck();}
	public  void peekCards() {stateCheck();}
	
	public void stateCheck() {
		if (player.getScore()<1000) {
			player.setLevel(new PrimaryLevel(player));
		}else if(player.getScore()<3000){
			player.setLevel(new SecondaryLevel(player));
		}else if (player.getScore()<6000) {
			player.setLevel(new ProfessionalLevel(player));
		}else {
			player.setLevel(new FinalLevel(player));
		}
	}
}
