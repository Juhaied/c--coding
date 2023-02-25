package task;

public class Area {

	private double radius;
	

	public Area(double radius) {
		this.setRadius(radius);
	}
	public void setX(double radius) {
		this.setRadius(radius);
	}
	public double getX() {
		return getRadius();
	}
	public double getArea() {
		return (Math.PI * getRadius() *getRadius());
	}
	public String toString() {
		return "Area[ Radius = "+getRadius() +"]";
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	

	

}
