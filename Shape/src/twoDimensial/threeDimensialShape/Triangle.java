package twoDimensial.threeDimensialShape;

public class Triangle extends Shape{
	private int base, height;
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	public double area() {
		return 0.5 * this.base * this.height;
	}
}
