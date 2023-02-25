package task;

public class Box {
	private double height;
	private double width;
	private double depth;
	
	public Box(double height,double width,double depth) {
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	public Box(int len) {
		 height = depth = width=len;
	}
	public Box(Box box) {
		this.height = box.height;
		this.width = box.width;
		this.depth = box.depth;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWidth(double width) {
		this.height = width;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
	public double getHeight() {
		return height;
	}
	public double getWidth() {
		return  width;
	}
	public double getDepth() {
		return depth;
	}
	public boolean isEqualsTo(Box o) {
		if(this.height == o.height && this.width == o.width && this.depth == o.depth) {
			return true;
		}
		else {
			return false;
		}
	}
	public double getVoloume() {
		return height * depth * width ;
	}
	public String toString() {
		return "Box[Height = "+height + " Width = "+width + " Depth = "+depth +"]";
	}
}
