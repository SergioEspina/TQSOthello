package TQSOthello;

public class Board {
	
	private final int HEIGHT = 8;
	private final int WIDTH = 8;
		
	private final int EMPTY = 0;
	private final int WHITE = 1;
	private final int BLACK = 2;
	
	private int[][] board;
	
	//Constructor clase Board
	public Board() {			
			board = new int[HEIGHT][WIDTH];
			
			for(int i = 0; i < HEIGHT; i++) {
				for(int j = 0; j < WIDTH; j++) {
					board[i][j] = EMPTY;
				}
			}
		}
	//Setters y getters
	public int getHeight() { return HEIGHT;}
	public int getWidth() {return WIDTH;}
	
	public int getCellValue(int x, int y) {
		return board[y][x];
	}
	
	//Inicializa tablero con la configuración inicial
	public void initBoard() {
		board[3][3] = WHITE;
		board[4][4] = WHITE;
		board[4][3] = BLACK;
		board[3][4] = BLACK;
	}
	
	public Tuple<Integer,Integer> calculateEndPlay(Tuple<Integer,Integer> cell, Tuple<Integer,Integer> dir, int level,int player) {
		Tuple<Integer,Integer> end = null;
		if(player < WHITE || player > BLACK) {
			throw new RuntimeException();
		}
		
		int newX = cell.x + dir.x;
		int newY = cell.y + dir.y;
		
		if ( newX >= 0 && newX < WIDTH) {
			if (newY >= 0 && newY < HEIGHT) {
				if (player == WHITE || player == BLACK) {
					if(board[newY][newX] == player && level != 0) {
						end = new Tuple<Integer,Integer>(newX,newY);
					}else if(board[newY][newX] != player && board[newY][newX] != EMPTY) {
						end = calculateEndPlay(new Tuple<Integer,Integer>(newX,newY), dir, level+1, player);
					}
				}
			}
		}
		
		return end;
	}
}
