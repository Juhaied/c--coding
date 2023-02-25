package task;

public class Rectangle extends Geometric{
	private double width; 
	private double height;
	
	public Rectangle() {
		width =  1.0;
		height = 1.0;
	}
	public Rectangle(double width,double height) {
		this.width = width;
		this.height = height;
	}
	public Rectangle(double width,double height,String color,boolean filled) {
		super(color, filled);
		this.width = width;
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getArea() {
		return height * width;
	}
	public double getperimeter() {
		return ((2 * height) + (2 * width));
	}
	
	
}
