package TQSOthello;

public class Tuple<X, Y> {
	
	public X x;
	public Y y;
	
	public Tuple(X x, Y y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() { return (int) x;}
	public int getY() { return (int) y;}
}