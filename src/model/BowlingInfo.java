package model;

/**  
* Logan Kennebeck - ljkennebeck1  
* CIS171 22149
* Aug 31, 2022  
*/
public class BowlingInfo {
	
	private String name;
	private int scoreOne;
	private int scoreTwo;
	private boolean strike;
	private boolean spare;
	
	public BowlingInfo() {
		setName("");
		setScoreOne(0);
		setScoreTwo(0);
		setStrike(false);
		setSpare(false);
	}
	
	public BowlingInfo(String name, int scoreOnFrame, boolean strike, boolean spare) {
		this.name = name;
		this.scoreOne= scoreOnFrame;
		this.strike = strike;
		this.spare = spare;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScoreOne() {
		return scoreOne;
	}

	public void setScoreOne(int scoreOne) {
		this.scoreOne = scoreOne;
	}
	
	public int getScoreTwo() {
		return scoreTwo;
	}

	public void setScoreTwo(int scoreTwo) {
		this.scoreTwo = scoreTwo;
	}

	public boolean isStrike() {
		return strike;
	}

	public void setStrike(boolean strike) {
		this.strike = strike;
	}

	public boolean isSpare() {
		return spare;
	}

	public void setSpare(boolean spare) {
		this.spare = spare;
	}
	
	

}
