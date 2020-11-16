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
	//loop testing
	@Test
	public void testPrintSeparator() {
		//No entra
		testOut.printSeparator(0);
		//Una vez
		testOut.printSeparator(1);
		//Dos veces
		testOut.printSeparator(2);
		//M veces donde m<n N=20
		testOut.printSeparator(10);
		//n-1 veces
		testOut.printSeparator(19);
		//n veces
		testOut.printSeparator(20);
	}

}
