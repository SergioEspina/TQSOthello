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
		
	//Condition coverage
	@Test
	public void testIsPositionInPlays() {
		testGame = new Game();
		ArrayList<Play> plays = new ArrayList<Play>();
		Tuple<Integer,Integer> position = new Tuple<Integer,Integer>(0,0);
		assertFalse(testGame.isPositionInPlays(plays, position));
		
		Play play = new Play(new Tuple<Integer, Integer>(0,0));
		plays.add(play);
		assertTrue(testGame.isPositionInPlays(plays, position));
		
		plays = new ArrayList<Play>();
		play = new Play(new Tuple<Integer, Integer>(0,1));
		plays.add(play);
		assertFalse(testGame.isPositionInPlays(plays, position));
		
		plays = new ArrayList<Play>();
		play = new Play(new Tuple<Integer, Integer>(1,0));
		plays.add(play);
		assertFalse(testGame.isPositionInPlays(plays, position));
		
	}
	
	//Condition coverage
	@Test
	public void testGetPlayByPosition() {
		testGame = new Game();
		ArrayList<Play> plays = new ArrayList<Play>();
		Tuple<Integer,Integer> position = new Tuple<Integer,Integer>(0,0);
		boolean condition = testGame.getPlayByPosition(plays, position) == null;
		assertTrue(condition);
		
		Play play = new Play(new Tuple<Integer, Integer>(0,0));
		plays.add(play);
		Play testPlay = testGame.getPlayByPosition(plays, position);
		condition = testPlay.getOrigin().x == play.getOrigin().x && testPlay.getOrigin().y == play.getOrigin().y;
		assertTrue(condition);
		
		plays = new ArrayList<Play>();
		play = new Play(new Tuple<Integer, Integer>(1,0));
		plays.add(play);
		testPlay = testGame.getPlayByPosition(plays, position);
		condition = testPlay == null;
		assertTrue(condition);
		
		plays = new ArrayList<Play>();
		play = new Play(new Tuple<Integer, Integer>(0,1));
		plays.add(play);
		testPlay = testGame.getPlayByPosition(plays, position);
		condition = testPlay == null;
		assertTrue(condition);
	}
	
	//Decision coverage
	@Test
	public void testPlayGame() {
		testGame = new Game();
		MockBoard b = new MockBoard();
		b.allBlack();
		
		testGame.setBoard(b);
		testGame.playGame();
		
		/*MockInputController in = new MockInputController();
		in.addInput(new Tuple<Integer, Integer>(3, 3));
		in.addInput(new Tuple<Integer, Integer>(0, 0));
		testGame = new Game();
		b = new MockBoard();
		b.allWhite();
		b.setCell(0, 0, 0);
		b.setCell(7, 7, 2);		
		testGame.setBoard(b);
		testGame.setInput(in);
		testGame.playGame();*/
		
	}

}
