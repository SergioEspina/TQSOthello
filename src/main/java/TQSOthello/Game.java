package TQSOthello;

import java.util.ArrayList;

public class Game {
	private final int WHITE = 1;
	private final int BLACK = 2;
	
	private Board board;
	private OutputView output;
	private InputController input;
	
	
	public Game() {
		
		board = new Board();		
		output = new OutputView();
		input = new InputController();
		
	}
		
	public int switchPlayer(int player) {
		if (player == WHITE) {
			return BLACK;
		}else if (player == BLACK){
			return WHITE;
		}
		return -1;
	}
	
	public void playGame() {
		board.initBoard();
		
		boolean endGame = false;
		boolean skippedLastTurn = false;
		int activePlayer = BLACK;
		ArrayList<Play> plays;
		
		do {
			plays = board.calculatePlays(activePlayer);
			if(plays.size() == 0) {
				output.printTurnSkipped(activePlayer);
				if(skippedLastTurn) {
					endGame = true;
				}else {
					skippedLastTurn = true;
				}
			}else {
				output.printBoard(board, plays);
				Tuple<Integer, Integer> position;
				do {
					position = input.askPosition();
				}while(!isPositionInPlays(position));
				board.executePlay(getPlayByPosition(), activePlayer);
				skippedLastTurn = false;
			}
			
			
		}while(!endGame);
	}
	
}
