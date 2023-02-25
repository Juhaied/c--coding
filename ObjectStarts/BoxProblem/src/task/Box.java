package task;

public class Box {
	private double width;
	private double height;
	private double depth;
	
	public Box() {
		width = height = depth = 1.0;
	}
	public Box(int len) {
		width = height = depth = len;
	}
	public Box(double width,double height,double depth) {
		
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public Box(Box box) {
		this.width = box.width;
		this.height = box.height;
		this.depth = box.depth;
		
	}
	public double getWidth() {
		return width;
	}
	public double getheight() {
		return height;
	}
	public double getdepth() {
		return depth;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setheight(double height) {
		this.width = depth;
	}
	public void setdepth(double depth) {
		this.width = height;
	}
	public void setDim(double width,double height,double depth) {
		this.width = width;
		this.height = height;
		
		this.depth = depth;
	}
	public boolean isEqualto(Box o) {
		if( this.width == o.width &&this.height == o.height && this.depth == o.depth)
			return true;
		else
			return false;
	}
	public double volume() {
		return width * height * depth;
	}
	
	
}
