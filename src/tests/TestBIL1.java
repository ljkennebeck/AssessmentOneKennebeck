package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.BILogic;
import model.BowlingInfo;

/**  
* Logan Kennebeck - ljkennebeck1  
* CIS171 22149
* Aug 31, 2022  
*/
public class TestBIL1 {
	BILogic bILogic = new BILogic();
	BowlingInfo bowlingInfo = new BowlingInfo();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testStrike() {
		int totalScore = 0;
		//setting scores in frame one
		bowlingInfo.setScoreOne(10);
		//checking if a spare was made
		boolean strike = bILogic.StrikeCheck(bowlingInfo);
		//setting scores in frame two
		bowlingInfo.setScoreOne(7);
		bowlingInfo.setScoreTwo(2);
		//resetting scores if a strike was made
		if(strike == true) {
			int scoreOne = bILogic.StrikeOne(bowlingInfo);
			int scoreTwo = bILogic.StrikeTwo(bowlingInfo); 
			totalScore = scoreOne + scoreTwo;
		}
		assertEquals(18, totalScore);
		
	}
	
	@Test
	public void testGreeting() {
		bowlingInfo.setName("Dave");
		String greeting = bILogic.BowlingAlleyGreeting(bowlingInfo);
		assertEquals(greeting, "Welcome Dave!");
	}

}
