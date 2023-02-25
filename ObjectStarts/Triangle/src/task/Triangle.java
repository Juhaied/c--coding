package task;

public class Triangle extends Geometric {
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3= 1.0;
	}
	public Triangle(double side1,double side2,double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public Triangle(double side1,double side2,double side3,String color,boolean filled) {
		super(color,filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	public double getArea() {
		
		if(side1 + side2 >= side3 || side1 + side3 >= side2 || side2 + side3 >= side1) {
			System.out.println("Valid triangle ");
			double avg = (side1 + side2 + side3)/2;
			double rslt = avg*(avg - side1)*(avg - side2)*(avg - side3);
		return Math.sqrt(rslt);
		}
		else {
			System.out.println("Invalid triangle");
			return -1;
		}
}
	public String toString() {
		return "Triangle [ Side1 = "+side1 + "Side2 = "+side2 + " Side3 = "+side3 +"]";
	}
	
}
