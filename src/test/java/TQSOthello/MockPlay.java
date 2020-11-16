package TQSOthello;

import java.util.ArrayList;

public class MockPlay extends Play{

	public MockPlay(Tuple<Integer, Integer> origin) {
		super(origin);
	}
	
	public void replaceEnds(ArrayList<Tuple<Integer, Integer>> ends) {
		this.ends = ends;
	}

}
