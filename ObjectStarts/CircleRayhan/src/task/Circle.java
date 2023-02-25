package task;

public class Circle {

	public double area;
	public double length;
	public double perimeter;
	public double width;
	
	public void Circle(double length) {
		this.length= length;
	}
	public void calcArea() {
	 System.out.println("Area = "+(length * length * Math.PI));
	}
}
