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
		if(origin.y < 0) {
			origin.y = 0;
		}else if (origin.y > 8) {
			origin.y = 8;
		}
		ends = new ArrayList<Tuple<Integer, Integer>>();
	}
	
	public Tuple<Integer, Integer> getOrigin(){
		return origin;
	}
	
	public ArrayList<Tuple<Integer, Integer>> getEnds() { return ends; }
	
	public void addEnd(Tuple<Integer, Integer> end) {
		if(end.x < 0) {
			end.x = 0;
		}else if(end.x > 8) {
			end.x = 8;
		}
		
		if(end.y < 0) {
			end.y = 0;
		}else if(end.y > 8) {
			end.y = 8;
		}
		ends.add(end);
	}
	
}
