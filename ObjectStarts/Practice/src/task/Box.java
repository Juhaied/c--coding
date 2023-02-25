package task;

public class Box {

	private double height;
	private double width;
	private double length;
	
	public Box(double height,double width,double length) {
		this.height = height;
		this.width = width;
		this.length = length;
	}
	public void setheight(double height) {
		this.height = height;
	}
	public void setWidth(double height) {
		this.width = width;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getHeight() {
		return height;
	}
	public double getlenght() {
		return length;
	}
	public double getWight() {
		return width;
	}
	public double getVolume() {
		return height * width * length;
	}
	public boolean isEqualsto(Box o) {
		if(width == o.width && length == o.length && height == o.height) {
			return true;
		}
		else 
			return false;
	}
	public String toString() {
		return "Box[Height = " +height + " Width = "+width + " length = "+length +"]";
	}
}
