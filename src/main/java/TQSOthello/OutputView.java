package TQSOthello;

import java.util.ArrayList;

public class OutputView {
	private final String WHITE_CHARACTER = "X";
	private final String BLACK_CHARACTER = "O";
	private final String EMPTY = " ";
	private final String POSSIBLE_PLAY = "*";
	private final String V_BAR = "|";
	private final String H_BAR = "---";
	private final String JUNCTION = "+";	
	private final String H_OFFSET = "  ";
	
	public void printBoard(Board board, ArrayList<Play> plays) {
		
		String colBar = "";
		String topBar = "";
		String middleBar = "";
		
		int width = board.getWidth();
		int height = board.getHeight();
		
		//Create colBar
		colBar = colBar +H_OFFSET;
		for(int i = 0; i < width; i++) {
			colBar = colBar +"  " + (i+1) + " ";
		}
		
		//Create topBar 
		topBar = topBar + H_OFFSET;
		for(int i = 0; i < width;i++) {
			topBar = topBar+" "+ H_BAR;
		}
		
		//Create middleBar
		if(width > 2) {
			middleBar = middleBar + H_OFFSET + V_BAR + H_BAR;
			for(int i = 1; i < width;i++) {
				middleBar = middleBar + JUNCTION + H_BAR;
			}
			middleBar = middleBar + V_BAR;
		}
				
		System.out.println(colBar);
		System.out.println(topBar);
		
		for(int i = 0; i < height; i++) {
			System.out.print((i+1) + " " + V_BAR);
			for(int j = 0; j < width; j++) {
				System.out.print(" ");
				
				switch (board.getCellValue(j, i)) {
				case 0:
					boolean isPlay = false;
					
					for (int z = 0; z < plays.size(); z++) {
						if(plays.get(z).getOrigin().x == j && plays.get(z).getOrigin().y == i) {
							isPlay = true;
							break;
						}
					}
					
					if (isPlay) {
						System.out.print(POSSIBLE_PLAY);
					}else {
						System.out.print(EMPTY);
					}				
					
					
					break;
				case 1:
					System.out.print(WHITE_CHARACTER);
					break;
				case 2:
					System.out.print(BLACK_CHARACTER);
				default:
					break;
				}
				
				System.out.print(" " + V_BAR);
			}
			System.out.println();
			if(i+1 < height) {
				System.out.println(middleBar);
			}else {
				System.out.println(topBar);
			}
		}
		
	}
	
	public void printTurnSkipped(int player) {
		if(player == 1) {
			System.out.println( WHITE_CHARACTER + "'s turn skipped");
		}else {
			System.out.println( BLACK_CHARACTER + "'s turn skipped");
		}
	}

	public void printPlayerTurn(int player) {
		if(player == 1) {
			System.out.print( WHITE_CHARACTER + "'s turn");
		}else {
			System.out.print( BLACK_CHARACTER + "'s turn");
		}
		System.out.println(" (" + POSSIBLE_PLAY + " indicates a possible play)");
	}
}