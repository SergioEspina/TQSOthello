package TQSOthello;

import java.util.Scanner;

public class InputController {
private Scanner s;
	
	public InputController() {
		s = new Scanner(System.in);		
	}
	
	public Tuple<Integer,Integer> askPosition(){
		Tuple<Integer, Integer> position = new Tuple<Integer,Integer>(-1,-1);
		
		int input;
		
		do {
			System.out.print("Row: ");
			if(s.hasNextInt()) {
				input = s.nextInt();
				if (input >= 0 && input <= 8) {
					position.x = input -1 ;
					break;
				}else {
					System.out.println("The value must be between 1 and 8");
				}
			}else {
				System.out.println("The number must be an integer");
				s.hasNext();
			}
		}while(true);
		
		do {
			System.out.print("Column: ");
			if(s.hasNextInt()) {
				input = s.nextInt();
				if (input >= 0 && input <= 8) {
					position.y = input -1 ;
					break;
				}else {
					System.out.println("The value must be between 1 and 8");
				}
			}else {
				System.out.println("The number must be an integer");
				s.hasNext();
			}
		}while(true);
		
		return position;
	}
	
	
	
}
