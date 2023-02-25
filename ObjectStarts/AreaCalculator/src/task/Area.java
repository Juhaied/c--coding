package task;

public class Area {

	private double height;
	private double width;
	private double radius;
	private double base;
	private int length;
	
	public Area(double radius) {
		this.radius = radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public double AreaOfCircle() {
		return Math.PI * radius *radius;
	}
	public Area(int length,int width) {
		this.length = length;
		this.width = width;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public double getlength() {
		return length;
	}
	public void setwidth(int width) {
		this.width = width;
	}
	public double getwidth() {
		return width;
	}
	public double AreaOfSquare() {
		return length * width;
	}
	public Area(double base,int height) {
		this.base = base;
		this.height = height;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setheight(int height) {
		this.height = height;
	}
	public double getBase() {
		return base;
	}
	public double AreaOfTriangular() {
		return base * height * 0.5;
	}
	public Area(double radius,double height) {
		this.radius = radius;
		this.height= height;
	}
	public double AreaOfCyclinder() {
		return Math.PI * radius * radius * height;
	}
}
