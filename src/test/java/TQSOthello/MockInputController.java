package TQSOthello;

import java.util.ArrayList;

public class MockInputController extends InputController{
	
	ArrayList<Tuple<Integer,Integer>> inputList;
	int index = 0;
	
	public MockInputController() {
		super();
		inputList = new ArrayList<Tuple<Integer,Integer>>();
	}
	
	public void addInput(Tuple<Integer,Integer> input) {
		inputList.add(input);
	}
	
	@Override
	public Tuple<Integer,Integer> askPosition(){
		if (index + 1 < inputList.size() ) {
			index++;
			return inputList.get(index-1);
		}
		return null;
	}
	
}
