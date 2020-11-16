package TQSOthello;

import java.util.ArrayList;

public class Play {

	private Tuple<Integer, Integer> origin;
	private ArrayList<Tuple<Integer, Integer>> ends;
	
	public Play(Tuple<Integer, Integer> origin) {
		this.origin = origin;
		ends = new ArrayList<Tuple<Integer, Integer>>();
	}
	
}
