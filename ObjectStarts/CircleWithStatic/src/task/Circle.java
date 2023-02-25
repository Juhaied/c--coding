package task;

public class Circle {

	private double radius;
	private static int circleCounter;
	
	public Circle() {
		 circleCounter++;
		radius =  circleCounter;
	}
	public Circle(double newradius) {
		
		
		if(newradius>=0) {
			radius = newradius;
			circleCounter++;
		}
		
	}
	public void setRadius(double radius) {
		this.radius =radius;
	}
	public double getRadius() {
		return radius;
	}
	public static int  circleCounter() {
		return  circleCounter;
	}
	public double getArea() {
		return radius * radius * Math.PI;
	}
	public String toString() {
		return "Circle [ radius = "+radius + "  circle  object created = "+ circleCounter + " ]";
	}
}
