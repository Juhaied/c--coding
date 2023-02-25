
public class Circle {

	public double radius;
	
	public Circle() {
		radius = 1.0;
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return Math.PI * radius *radius;
	}
	public String toString() {
		return "Circle[Radius = "+radius  +"]";
	}
	
}
