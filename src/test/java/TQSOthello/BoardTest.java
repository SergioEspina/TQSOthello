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
	
	@Test
	public void testInitBoard() {
		testBoard = new Board();
		testBoard.initBoard();
		assertEquals(1,testBoard.getCellValue(3, 3));
		assertEquals(1,testBoard.getCellValue(4, 4));
		assertEquals(2,testBoard.getCellValue(3, 4));
		assertEquals(2,testBoard.getCellValue(4, 3));
	}

}
