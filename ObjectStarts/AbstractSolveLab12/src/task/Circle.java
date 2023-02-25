package task;

public class Circle extends Shape{

	private int CircleId;
	private  static int circleCounter;
	
	public Circle(double radius) {
		super(radius,radius);
		circleCounter++;
		CircleId = circleCounter;
	}
	
	public double getArea() {
		return Math.PI * getDimension1() * getDimension2();
	}
	public void setRadius(double radius) {
		setDimension1(radius);
		setDimension2(radius);
	}
	public double getRadius() {
		return getDimension1();
	}
	public int getCircleId() {
		return CircleId;
	}
	public static int circleCounter() {
		return circleCounter;
	}
	public String getName() {
		return "Circle";
	}
	public String toString() {
		return "Circle[ Circleid = "+CircleId + " Circle counter = "+circleCounter + " Radius = "+getDimension1() + " Name = "+getName() + "]";
	}
}
