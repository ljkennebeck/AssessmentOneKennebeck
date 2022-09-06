package model;
/**  
* Logan Kennebeck - ljkennebeck1  
* CIS171 22149
* Aug 31, 2022  
*/
public class BILogic {
	
	public String BowlingAlleyGreeting(BowlingInfo bowlingInfo) {
		return "Welcome "+bowlingInfo.getName()+"!";
	}
	//checking if a strike was made
	public boolean StrikeCheck(BowlingInfo bowlingInfo) {
		if(bowlingInfo.getScoreOne() == 10 || bowlingInfo.getScoreOne() == 20) {
			bowlingInfo.setStrike(true);
		}
		return bowlingInfo.isStrike();
	}
	//resetting scoreOne if a strike was made
	public int StrikeOne(BowlingInfo bowlingInfo) {
		int newScore = bowlingInfo.getScoreOne() * 2;
		return newScore;
	}
	//resetting scoreTwo if a strike was made
	public int StrikeTwo(BowlingInfo bowlingInfo) {
		int newScore = bowlingInfo.getScoreTwo() * 2;
		bowlingInfo.setStrike(false);
		return newScore;
	}
	//checking if a spare was made
	public boolean SpareCheck(BowlingInfo bowlingInfo) {
		int totalScore = bowlingInfo.getScoreOne() + bowlingInfo.getScoreTwo();
		if(totalScore == 10 || totalScore == 20) {
			bowlingInfo.setSpare(true);
		}
		return bowlingInfo.isSpare();
	}
	//resetting scoreOne if a spare was made
	public int Spare(BowlingInfo bowlingInfo) {
		int newScore = bowlingInfo.getScoreOne() * 2;
		return newScore;
	}

}
