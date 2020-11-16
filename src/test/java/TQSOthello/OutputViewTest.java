package TQSOthello;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class OutputViewTest {
	
	OutputView testOut = new OutputView();
	
	//Statement coverage
	@Test
	public void test() {
		
		Board b = new Board();
		b.initBoard();
		ArrayList<Play> plays =  b.calculatePlays(2);
		
		testOut.printBoard(b, plays);
	}

}
