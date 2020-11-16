package TQSOthello;

import java.util.ArrayList;

public class Play {

	private Tuple<Integer, Integer> origin;
	private ArrayList<Tuple<Integer, Integer>> ends;
	
	public Play(Tuple<Integer, Integer> origin) {
		this.origin = origin;
		if(origin.x < 0) {
			origin.x = 0;
		}else if (origin.x > 8) {
			origin.x = 8;
		}
		ends = new ArrayList<Tuple<Integer, Integer>>();
	}
	
	public Tuple<Integer, Integer> getOrigin(){
		return origin;
	}
	
	public ArrayList<Tuple<Integer, Integer>> getEnds() { return ends; }
	
	public void addEnd(Tuple<Integer, Integer> end) {
		
	}
	
}
