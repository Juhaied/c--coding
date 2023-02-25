package task;

public class Circle {

	public double radius;
	public String color;
	
	public Circle() {
		radius = 1.0;
		color = "red";
	}
	public Circle(double radius,String color) {
		this.radius = radius;
		this.color =color;
	}
	public  double getArea() {
		return (Math.PI * radius * radius);
	}
	public String toString() {
		
		return "Circle[ radius = "+radius + " color = "+color + "]";
	}
}
