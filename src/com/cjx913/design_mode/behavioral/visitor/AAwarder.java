package com.cjx913.design_mode.behavioral.visitor;

public abstract class AAwarder {
	protected String name;
	protected int articleCount;
	protected int score;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getArticleCount() {
		return articleCount;
	}

	public void setArticleCount(int articleCount) {
		this.articleCount = articleCount;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public AAwarder(String name, int articleCount, int score) {
		super();
		this.name = name;
		this.articleCount = articleCount;
		this.score = score;
	}
	
	public abstract void accept(AAwardCheck awardCheck);
}
