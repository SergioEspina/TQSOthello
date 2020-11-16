package TQSOthello;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {

	Board testBoard;
	
	//Test constructor de la clase Board
	@Test
	public void testConstructor() {
		testBoard = new Board();
		assertEquals(8, testBoard.getHeight());
		assertEquals(8, testBoard.getWidth());
	}

}
