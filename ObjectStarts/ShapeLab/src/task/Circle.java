package task;

public class Circle extends Shape {

	private int circleId;
	private  static int CircleCounter;
	
	public Circle(double radius) {
		super(radius,radius);
		CircleCounter++;
		circleId = CircleCounter;
	}
	public void setRadius(double radius) {
		setDimension1(radius);
		setDimension2(radius);
	}
	public double getRadius() {
		return getDimension1();
	}
	public int getCirCleId() {
		return circleId;
	}
	public  static int getCircleCounter() {
		return CircleCounter;
	}
	public String getName() {
		return "Circle";
	}
	public double getArea() {
		return Math.PI * getDimension1() * getDimension2();
	}
	public String toString() {
		return "Circle[ Circleid = "+circleId + " Circle counter = "+CircleCounter + " Radius = "+getDimension1() + " Name = "+getName() + "]";
	}
	
}
