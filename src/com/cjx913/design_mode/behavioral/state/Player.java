package com.cjx913.design_mode.behavioral.state;

public class Player {
	private Level level;
	private String name;
	private int score;

	public Player(String name) {
		this.name = name;
		this.score = 0;
		this.level = new PrimaryLevel(this);
	}
	
	public Player(String name,int score) {
		this.name = name;
		this.score = score;
		if (this.getScore()<1000) {
			this.level = new PrimaryLevel(this);
		}else if(this.getScore()<2000){
			this.level=new SecondaryLevel(this);
		}else if (this.getScore()<5000) {
			this.level = new ProfessionalLevel(this);
		}else {
			this.level = new FinalLevel(this);
		}
	}

	public Level getLevel() {
		return level;
	}
	
	public void setLevel(Level level) {
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void play() {
		level.play();
	}

	public void doubleScore() {
		level.doubleScore();
	}

	public void changeCards() {
		level.changeCards();
	}

	public void peekCards() {
		level.peekCards();
	}
}
