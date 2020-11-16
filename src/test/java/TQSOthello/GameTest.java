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

}
