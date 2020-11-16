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
	
}
