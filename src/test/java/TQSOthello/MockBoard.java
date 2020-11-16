package TQSOthello;

public class MockBoard extends Board{
		
	public MockBoard() {
		super();
	}
	
	public void setMatrix(int[][] matrix) {
		for(int i = 0; i < this.HEIGHT; i++) {
			for(int j = 0; i < this.WIDTH; j++) {
				this.board[i][j] = matrix[i][j];
			}
		}
	}
	
	public void allWhite() {
		for(int i = 0; i < HEIGHT; i++) {
			for(int j = 0; j < WIDTH; j++) {
				board[i][j] = 1;
			}
		}
	}
	
	public void allBlack() {
		for(int i = 0; i < HEIGHT; i++) {
			for(int j = 0; j < WIDTH; j++) {
				board[i][j] = 2;
			}
		}
	}
	
	public void setCell(int x,int y,int value) {
		this.board[y][x] = value;
	}
	
}
