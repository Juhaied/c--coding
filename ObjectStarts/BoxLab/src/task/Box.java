 package task;

public class Box {
	
	private double width;
	private double height;
	private double depth;
	
	public Box() {
		width = height = depth = 1;
	}
	public Box(double len) {
		width = depth = height = len;
	}
	public Box(double width,double height,double depth) {
		this.width= width;
		this.height = height;
		this.depth = depth;
	}
	public Box(Box box) {
		this.width = box.width;
		this.height =box.height;
		this.depth = box.depth;
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public double geDepth() {
		return depth;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
	public void setDim(double width,double height,double depth) {
		this.width= width;
		this.height = height;
		this.depth = depth;
	}
	public boolean equalsto(Box o) {
		if( o.width ==width && o.height==height && o.depth==depth) 
			return true;
		
		else
			return false;
		
	}
	public double volume() {
		return width * height * depth;
	}
	public String toString() {
		return "Box[Width = "+width + " height = "+height + " depth = "+depth +"]=";
	}

}
