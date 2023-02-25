package task02Lab;

public class Circle implements GeometricObject{

	protected double radius;
	
	
	public Circle(double radius) {
		
		this.radius = radius;
	}
	
	public double getPerimeter() {
		return Math.PI * 2 * radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
}
