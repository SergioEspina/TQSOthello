package TQSOthello;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayTest {
	
	Play play;

	//Input origin
	//Particiones equivalentes: -inf a -1, 0 a 8, 9 a +inf
	//Valores frontera: -1,0,8,9
	@Test
	public void testConstructor() {
		//X < 0
		play = new Play(new Tuple<Integer, Integer>(-20, 5));
		assertEquals(0, play.getOrigin().getX());
		play = new Play(new Tuple<Integer, Integer>(-1, 5));
		assertEquals(0, play.getOrigin().getX());
		//0 >= x <= 8
		play = new Play(new Tuple<Integer, Integer>(0, 5));
		assertEquals(0, play.getOrigin().getX());
		play = new Play(new Tuple<Integer, Integer>(5, 5));
		assertEquals(5, play.getOrigin().getX());
		play = new Play(new Tuple<Integer, Integer>(8, 5));
		assertEquals(8, play.getOrigin().getX());
		//X > 8
		play = new Play(new Tuple<Integer, Integer>(9, 5));
		assertEquals(8, play.getOrigin().getX());
		play = new Play(new Tuple<Integer, Integer>(20, 5));
		assertEquals(8, play.getOrigin().getX());
		//Y < 0
		play = new Play(new Tuple<Integer, Integer>(5,-20));
		assertEquals(0, play.getOrigin().getY());
		play = new Play(new Tuple<Integer, Integer>(5,-1));
		assertEquals(0, play.getOrigin().getY());
		//0 >= Y <= 8
		play = new Play(new Tuple<Integer, Integer>(5,0));
		assertEquals(0, play.getOrigin().getY());
		play = new Play(new Tuple<Integer, Integer>(5, 5));
		assertEquals(5, play.getOrigin().getY());
		play = new Play(new Tuple<Integer, Integer>(5,8));
		assertEquals(8, play.getOrigin().getY());
		//Y > 8
		play = new Play(new Tuple<Integer, Integer>(5,9));
		assertEquals(8, play.getOrigin().getY());
		play = new Play(new Tuple<Integer, Integer>(5,20));
		assertEquals(8, play.getOrigin().getY());
		
	}
	
	
	//Input end
	//Particiones equivalentes: -inf a -1, 0 a 8, 9 a +inf
	//Valores frontera: -1,0,8,9
	@Test
	public void testAddEnd() {
		//x < 0
		play = new Play(new Tuple<Integer, Integer>(5, 5));
		play.addEnd(new Tuple<Integer, Integer>(-20,5));
		assertEquals(0, play.getEnds().get(0).getX());
		play = new Play(new Tuple<Integer, Integer>(5, 5));
		play.addEnd(new Tuple<Integer, Integer>(-1,5));
		assertEquals(0, play.getEnds().get(0).getX());
		//0 >= x <= 8
		play = new Play(new Tuple<Integer, Integer>(5, 5));
		play.addEnd(new Tuple<Integer, Integer>(0,5));
		assertEquals(0, play.getEnds().get(0).getX());
		play = new Play(new Tuple<Integer, Integer>(5, 5));
		play.addEnd(new Tuple<Integer, Integer>(5,5));
		assertEquals(5, play.getEnds().get(0).getX());
		play = new Play(new Tuple<Integer, Integer>(5, 5));
		play.addEnd(new Tuple<Integer, Integer>(8,5));
		assertEquals(8, play.getEnds().get(0).getX());
		//X > 8
		play = new Play(new Tuple<Integer, Integer>(5, 5));
		play.addEnd(new Tuple<Integer, Integer>(9,5));
		assertEquals(8, play.getEnds().get(0).getX());
		play = new Play(new Tuple<Integer, Integer>(5, 5));
		play.addEnd(new Tuple<Integer, Integer>(20,5));
		assertEquals(8, play.getEnds().get(0).getX());
		
		//y < 0
		play = new Play(new Tuple<Integer, Integer>(5, 5));
		play.addEnd(new Tuple<Integer, Integer>(5,-20));
		assertEquals(0, play.getEnds().get(0).getY());
		play = new Play(new Tuple<Integer, Integer>(5, 5));
		play.addEnd(new Tuple<Integer, Integer>(5,-1));
		assertEquals(0, play.getEnds().get(0).getY());
		//0 >= y <= 8
		play = new Play(new Tuple<Integer, Integer>(5, 5));
		play.addEnd(new Tuple<Integer, Integer>(5,0));
		assertEquals(0, play.getEnds().get(0).getY());
		play = new Play(new Tuple<Integer, Integer>(5, 5));
		play.addEnd(new Tuple<Integer, Integer>(5,5));
		assertEquals(5, play.getEnds().get(0).getY());
		play = new Play(new Tuple<Integer, Integer>(5, 5));
		play.addEnd(new Tuple<Integer, Integer>(5,8));
		assertEquals(8, play.getEnds().get(0).getY());
		//y > 8
		play = new Play(new Tuple<Integer, Integer>(5, 5));
		play.addEnd(new Tuple<Integer, Integer>(5,9));
		assertEquals(8, play.getEnds().get(0).getY());
		play = new Play(new Tuple<Integer, Integer>(5, 5));
		play.addEnd(new Tuple<Integer, Integer>(5,20));
		assertEquals(8, play.getEnds().get(0).getY());
		
		
	}

}
