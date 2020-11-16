package TQSOthello;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

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
	
	
	@Rule
	public final ExpectedException exception = ExpectedException.none();
	
	//Player: Particiones equivalentes: -inf a 0, 1 a 2, 3 a +inf
	//		  Valores frontera: 0,1,2,3
	@Test
	public void testCalculateEndPlayPlayerMinus5() {
		testBoard = new Board();
		testBoard.initBoard();
		exception.expect(RuntimeException.class);
		testBoard.calculateEndPlay(null, null, 0, -5);		
	}
	@Test
	public void testCalculateEndPlayPlayer0() {
		testBoard = new Board();
		testBoard.initBoard();
		exception.expect(RuntimeException.class);
		testBoard.calculateEndPlay(null, null, 0, 0);
	}
	@Test
	public void testCalculateEndPlayPlayer3() {
		testBoard = new Board();
		testBoard.initBoard();
		exception.expect(RuntimeException.class);
		testBoard.calculateEndPlay(null, null, 0, 3);
	}
	@Test
	public void testCalculateEndPlayPlayer5() {
		testBoard = new Board();
		testBoard.initBoard();
		exception.expect(RuntimeException.class);
		testBoard.calculateEndPlay(null, null, 0, 5);
	}
	
	
	//Player: Particiones equivalentes: -inf a 0, 1 a 2, 3 a +inf
	//		  Valores frontera: 0,1,2,3
	@Test
	public void testCalculatePlaysPlayerMinus5() {
		testBoard = new Board();
		testBoard.initBoard();
		exception.expect(RuntimeException.class);
		testBoard.calculatePlays(-5);	
	}
	@Test
	public void testCalculatePlaysPlayer0() {
		testBoard = new Board();
		testBoard.initBoard();
		exception.expect(RuntimeException.class);
		testBoard.calculatePlays(0);	
	}
	@Test
	public void testCalculatePlaysPlayer3() {
		testBoard = new Board();
		testBoard.initBoard();
		exception.expect(RuntimeException.class);
		testBoard.calculatePlays(3);	
	}
	@Test
	public void testCalculatePlaysPlayer5() {
		testBoard = new Board();
		testBoard.initBoard();
		exception.expect(RuntimeException.class);
		testBoard.calculatePlays(5);	
	}
	
	@Test
	public void testExecutePlayPlayerMinus5() {
		testBoard = new Board();
		testBoard.initBoard();
		exception.expect(RuntimeException.class);
		testBoard.executePlay(null, -5);	
	}
	public void testExecutePlayPlayer0() {
		testBoard = new Board();
		testBoard.initBoard();
		exception.expect(RuntimeException.class);
		testBoard.executePlay(null, 0);	
	}
	public void testExecutePlayPlayer3() {
		testBoard = new Board();
		testBoard.initBoard();
		exception.expect(RuntimeException.class);
		testBoard.executePlay(null, 3);	
	}
	public void testExecutePlayPlayer5() {
		testBoard = new Board();
		testBoard.initBoard();
		exception.expect(RuntimeException.class);
		testBoard.executePlay(null, 5);	
	}

}
