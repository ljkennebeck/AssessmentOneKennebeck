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
public class TestBIL2 {
	BILogic bILogic = new BILogic();
	BowlingInfo bowlingInfo = new BowlingInfo();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSpareTrue() {
		int totalScore = 0;
		//setting scores in frame one
		bowlingInfo.setScoreOne(7);
		bowlingInfo.setScoreTwo(3);
		//checking if a spare was made
		boolean spare = bILogic.SpareCheck(bowlingInfo);
		//setting scores in frame two
		bowlingInfo.setScoreOne(6);
		bowlingInfo.setScoreTwo(2);
		//resetting scores if a spare was made
		if(spare == true) {
			int scoreOne = bILogic.Spare(bowlingInfo);
			totalScore = scoreOne + bowlingInfo.getScoreTwo();
		}else {
			totalScore = bowlingInfo.getScoreOne() + bowlingInfo.getScoreTwo();
		}
		assertTrue(14 == totalScore);
	}
	
	@Test
	public void testSpareFalse() {
		int totalScore = 0;
		//setting scores in frame one
		bowlingInfo.setScoreOne(4);
		bowlingInfo.setScoreTwo(3);
		//checking if a spare was made
		boolean spare = bILogic.SpareCheck(bowlingInfo);
		//setting scores in frame two
		bowlingInfo.setScoreOne(6);
		bowlingInfo.setScoreTwo(2);
		//resetting scores if a spare was made
		if(spare == true) {
			int scoreOne = bILogic.Spare(bowlingInfo);
			totalScore = scoreOne + bowlingInfo.getScoreTwo();
			assertFalse(14 == totalScore);
		}else {
			totalScore = bowlingInfo.getScoreOne() + bowlingInfo.getScoreTwo();
		}
		assertFalse(14 == totalScore);
	}

}
