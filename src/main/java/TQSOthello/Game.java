package TQSOthello;

public class Game {
	private final int WHITE = 1;
	private final int BLACK = 2;
	
	private Board board;
	private OutputView output;
	
	private boolean twoPlayers;
	
	public Game(boolean twoPlayers) {
		
		board = new Board();		
		output = new OutputView();
		
		this.twoPlayers = twoPlayers;
	}
	
	public boolean isTwoPlayers() {
		return twoPlayers;
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
