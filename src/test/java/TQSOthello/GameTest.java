package TQSOthello;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest {

	Game testGame;
	
	@Test
	public void testGame() {
		testGame = new Game(true);
		assertTrue(testGame.isTwoPlayers());
		testGame = new Game(false);
		assertFalse(testGame.isTwoPlayers());
	}
	
	//Player: Particiones equivalentes: -inf a 0, 1 a 2, 3 a +inf
	//		  Valores frontera: 0,1,2,3
	@Test
	public void testSwitchPlayer() {
		testGame = new Game(true);
		assertEquals(-1, testGame.switchPlayer(-5));
		assertEquals(-1, testGame.switchPlayer(0));
		assertEquals(2, testGame.switchPlayer(1));
		assertEquals(1, testGame.switchPlayer(2));
		assertEquals(-1, testGame.switchPlayer(3));
		assertEquals(-1, testGame.switchPlayer(5));
	}

}
