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
	
	//Decision coverage
	@Test
	public void testCalculateEndPlayDecision() {
		testBoard = new Board();
		testBoard.initBoard();
		testBoard.calculateEndPlay(new Tuple<Integer,Integer>(0,0), new Tuple<Integer,Integer>(0,0), 0,1);
		testBoard.calculateEndPlay(new Tuple<Integer,Integer>(-1,0), new Tuple<Integer,Integer>(0,0), 0,1);
		testBoard.calculateEndPlay(new Tuple<Integer,Integer>(0,-1), new Tuple<Integer,Integer>(0,0), 0,1);
		testBoard.calculateEndPlay(new Tuple<Integer,Integer>(-1,-1), new Tuple<Integer,Integer>(0,0), 0,1);
		testBoard.calculateEndPlay(new Tuple<Integer,Integer>(10,10), new Tuple<Integer,Integer>(0,0), 0,1);
		
		MockBoard testBoard2 = new MockBoard();
		
		testBoard2.allWhite();		
		testBoard2.calculateEndPlay(new Tuple<Integer,Integer>(5,5), new Tuple<Integer,Integer>(1,1), 1,1);
		testBoard2.allBlack();		
		testBoard2.calculateEndPlay(new Tuple<Integer,Integer>(5,5), new Tuple<Integer,Integer>(1,1), 0,1);
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
	@Test
	public void testExecutePlayPlayer0() {
		testBoard = new Board();
		testBoard.initBoard();
		exception.expect(RuntimeException.class);
		testBoard.executePlay(null, 0);	
	}
	@Test
	public void testExecutePlayPlayer3() {
		testBoard = new Board();
		testBoard.initBoard();
		exception.expect(RuntimeException.class);
		testBoard.executePlay(null, 3);	
	}
	@Test
	public void testExecutePlayPlayer5() {
		testBoard = new Board();
		testBoard.initBoard();
		exception.expect(RuntimeException.class);
		testBoard.executePlay(null, 5);	
	}
	
	//Decision coverage
	@Test 
	public void testCalculatePlayDecision() {
		MockBoard testBoard2 = new MockBoard();
		testBoard2.calculatePlays(2);
		testBoard2.initBoard();
		testBoard2.calculatePlays(2);
		
	}
	
}
