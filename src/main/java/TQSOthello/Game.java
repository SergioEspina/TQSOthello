package TQSOthello;

public class Game {
	private final int WHITE = 1;
	private final int BLACK = 2;
	
	private Board board;
	private OutputView output;
	
	
	public Game() {
		
		board = new Board();		
		output = new OutputView();
		
	}
		
	public int switchPlayer(int player) {
		if (player == WHITE) {
			return BLACK;
		}else if (player == BLACK){
			return WHITE;
		}
		return -1;
	}
	
}
