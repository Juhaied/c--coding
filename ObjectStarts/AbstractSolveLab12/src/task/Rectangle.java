package task;

public class Rectangle extends Shape{

	private int rectangleId;
	private static int rectangleCounter;
	
	public Rectangle(double side1, double side2) {
		super(side1 , side2);
		rectangleCounter++;
		rectangleId = rectangleCounter;
	}
	public void setSide1(double side1) {
		setDimension1(side1);
	}
	public void setSide2(double side2) {
		setDimension2(side2);
	}
	public double getSide1() {
		return getDimension1();
	}
	public double getSide2() {
		return getDimension2();
	}
	public int getRectangleid() {
		return rectangleId;
	}
	public static int getRectangleCounter() {
		return rectangleCounter;
	}
	public String getName() {
		return "Rectangle";
	}
	public double getArea() {
		return getDimension1() * getDimension2();
	}
	public String toString() {
		return "Rectangle[ rectangle Id = "+ rectangleId+ " rectangle counter = "+rectangleCounter + " side1 = "+getDimension1() +  " side2 = "+getDimension2() + " Name = "+getName() + "]";
	}
}
