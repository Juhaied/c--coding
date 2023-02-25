package task;

public abstract class Shape3d {

	private String color;
	private boolean filled;
	
	public Shape3d() {
		color = " Red ";
		filled =  false;
	}
	public Shape3d(String color,boolean filled){
		this.color= color;
		this.filled = filled;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public boolean isFilled() {
		return true;
	}
	protected double area() {
		return 
	}
}
