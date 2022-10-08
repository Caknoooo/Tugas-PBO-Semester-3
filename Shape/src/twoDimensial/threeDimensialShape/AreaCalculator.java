package twoDimensial.threeDimensialShape;

import java.util.ArrayList;
import java.util.List;

public class AreaCalculator {

	private List<Shape> shapes;
	
	public AreaCalculator() {
		this.shapes = new ArrayList<>();
	}
	
	public void addShape(Shape s) {
		this.shapes.add(s);
	}
	
	public double calculateArea() {
		
		double totalArea = 0.0;
		
		for(Shape s : this.shapes) {
			totalArea += s.area();
		}
		
		return totalArea;
	}
}

