package task;

public class Box {
	private double width;
	private double height;
	private double depth;
	
	public Box() {
		width = 1.0;
		height = 1.0;
		depth = 1.0;
	}
	public Box(double len) {
		width = height = depth = len;
	}
	public Box(double width , double height ,double depth) {
		this.width = width ;
		this.height = height;
		this.depth = depth;
	}
	public Box(Box box) {
		this.width = box.width ;
		this.height = box.height;
		this.depth =box.depth;
	}
	public double getwidth() {
		return width;
	}
	public double getheight() {
		return height;
	}
	public double getdepth() {
		return depth;
	}
	public void setDim(double width , double height ,double depth) {
		this.width = width ;
		this.height = height;
		this.depth = depth;
	}
	public boolean isEqualsTo(Box o) {
		if(width == o.width && height == o.height && depth == o.depth) {
			return true;
		}
		else {
			return false;
		}
	}
	public double volume() {
		return width * height * depth;
	}
	
	public String toString() {
		return "Box[width = "+width +"height = "+height + " depth = " +depth +"]";
	}
	
}

