package twoDimensial.threeDimensialShape;

public class Main {
	public static void main(String[] args) {

		Circle c1 = new Circle(10);
		Triangle t1 = new Triangle(10, 20);
		Square s1 = new Square(10);
		
		Shape s = new Shape();
		s.area();
		
		AreaCalculator calc = new AreaCalculator();
		calc.addShape(c1);
		calc.addShape(t1);
		calc.addShape(s1);
		
		System.out.println("Total area: " + calc.calculateArea());
	}
}
