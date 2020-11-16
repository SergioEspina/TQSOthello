package TQSOthello;

import static org.junit.Assert.*;

import org.junit.Test;

public class TupleTest {

	Tuple<Integer,Integer> tuple;
	
	//Partición equivalente: Hay una que son todos los enteros
	//Valores frontera: no existen
	@Test
	public void testTuple() {
		tuple = new Tuple<Integer,Integer>(0,0);
		boolean condition1 = tuple.x == 0;
		boolean condition2 = tuple.y == 0;
		assertTrue(condition1);
		assertTrue(condition2);
	}

}
