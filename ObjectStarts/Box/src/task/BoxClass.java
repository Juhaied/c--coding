package task;

public class BoxClass implements Box{

	double width;
	double height ;
	double depth;
	
	public BoxClass(double width,double height,double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public BoxClass(double length) {
		width = depth=  height= length;
	}
	public double volume() {
		return width* height * depth;
	}
}
