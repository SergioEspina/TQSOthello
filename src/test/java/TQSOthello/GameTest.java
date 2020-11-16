package TQSOthello;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class GameTest {

	Game testGame;
	
	@Test
	public void testGame() {
		testGame = new Game();
	}
	
	//Player: Particiones equivalentes: -inf a 0, 1 a 2, 3 a +inf
	//		  Valores frontera: 0,1,2,3
	@Test
	public void testSwitchPlayer() {
		testGame = new Game();
		assertEquals(-1, testGame.switchPlayer(-5));
		assertEquals(-1, testGame.switchPlayer(0));
		assertEquals(2, testGame.switchPlayer(1));
		assertEquals(1, testGame.switchPlayer(2));
		assertEquals(-1, testGame.switchPlayer(3));
		assertEquals(-1, testGame.switchPlayer(5));
	}
	
	@Test
	public void  testPlayGame() {
		
	}
	
	@Test
	public void testIsPositionInPlays() {
		testGame = new Game();
		ArrayList<Play> plays = new ArrayList<Play>();
		Tuple<Integer,Integer> position = new Tuple<Integer,Integer>(0,0);
		assertFalse(testGame.isPositionInPlays(plays, position));
		
		Play play = new Play(new Tuple<Integer, Integer>(0,0));
		plays.add(play);
		assertTrue(testGame.isPositionInPlays(plays, position));
		
	}
	
	@Test
	public void testGetPlayByPosition() {
		testGame = new Game();
		ArrayList<Play> plays = new ArrayList<Play>();
		Tuple<Integer,Integer> position = new Tuple<Integer,Integer>(0,0);
		boolean condition = testGame.getPlayByPosition(plays, position) == null;
		assertTrue(condition);
	}

}
