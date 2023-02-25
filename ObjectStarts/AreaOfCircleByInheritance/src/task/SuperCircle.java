package task;

public class SuperCircle extends Area{

	private double perimeter;
	
	public SuperCircle(double radius,double perimeter) {
		super(radius);
		this.perimeter = perimeter;
		
	}
	public void setPeri(double perimeter) {
		this.perimeter = perimeter;
	}
	public double getPeri() {
		return perimeter;
	}
	public double getAreaOfPeri() {
		return Math.PI * 2 * super(radius);
	}
	
}
