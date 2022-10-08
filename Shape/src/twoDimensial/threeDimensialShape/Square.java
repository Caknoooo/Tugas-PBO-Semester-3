package twoDimensial.threeDimensialShape;

public class Square extends Shape{
	private int side;
	
	public Square(int side) {
		this.side = side;
	}
	
	public double area() {
		return this.side * this.side;
	}
}
