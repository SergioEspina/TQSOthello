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
	
}
