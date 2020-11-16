package TQSOthello;

import java.util.ArrayList;

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
	
	public ArrayList<Play> calculatePlays(int player){
		
		ArrayList<Play> plays = new ArrayList<Play>();
		if(player < WHITE || player > BLACK) {
			throw new RuntimeException();
		}
		for(int i = 0; i < HEIGHT; i++) {
			for(int j = 0; j < WIDTH; j++) {
				if (board[i][j] == EMPTY) {					
					Play play = new Play(new Tuple<Integer,Integer>(j,i));
					boolean addPlay = false;
					for( int dirX = -1; dirX <= 1; dirX++) {
						for( int dirY = -1; dirY <= 1; dirY++) {
							
							Tuple<Integer, Integer> end = calculateEndPlay(new Tuple<Integer, Integer>(j, i), new Tuple<Integer, Integer>(dirX,dirY), 0, player);
							if (end != null) {
								play.addEnd(end);
								addPlay = true;
							}
						}
					}
					
					if(addPlay) {
						plays.add(play);
					}
					
				}
			}
		}
		return plays;
	}
	
	public void executePlay(Play play, int player) {
		if(player < WHITE || player > BLACK) {
			throw new RuntimeException();
		}
		
	Tuple<Integer,Integer> origin = play.getOrigin();
		
		board[origin.y][origin.x] = player;
		
		play.getEnds().forEach( (end) -> {
			Tuple<Integer,Integer> dir = new Tuple<Integer, Integer>(0, 0);
			if (end.x > origin.x) {
				dir.x = 1;
			}else if (end.x < origin.x) {
				dir.x = -1;
			}			
			if (end.y > origin.y) {
				dir.y = 1;
			}else if (end.y < origin.y) {
				dir.y = -1;
			}
			
			Tuple<Integer,Integer> position = new Tuple<Integer, Integer>(origin.x + dir.x, origin.y + dir.y );
			
			while (position.x != end.x || position.y != end.y) {
				board[position.y][position.x] = player;
				position.x += dir.x;
				position.y += dir.y;
			}
			
		});
		
	}
}
