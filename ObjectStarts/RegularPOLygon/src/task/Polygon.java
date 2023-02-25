package task;

public class Polygon {
	private int numOfSide;
	private double side;
	private double x;
	private double y;
	private static int numOfObjects ;
	
	public Polygon() {
		numOfObjects++;
		numOfSide = 3;
		side = 1;
		x = 0;
		y = 0;
	}
	public Polygon(int numOfSide,double side) {
		numOfObjects++;
		this.numOfSide = numOfSide;
		this.side = side;
		x = 0;
		y = 0;
	}
	public Polygon(int numOfSide,double side,double x,double y) {
		this.numOfSide = numOfSide;
		this.side = side;
		this.x =x;
		this.y = y;
		numOfObjects++;
	}
	public void setnumOdSide(int numOfSide) {
		this.numOfSide = numOfSide;
	}
	public void setSide(double side) {
		this.side =  side;
	}
	public void setX(double x) {
		this.x  = x;
	}
	public void setY(double y) {
		this.y  = y;
	}
	public int getnumOfSide() {
		return numOfSide;
	}
	public double getSide() {
		return side;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y; 
	}
	public double getPerimeter() {
		return numOfSide * side;
	}
	public double getArea() {
		double a1 = numOfSide * side * side;
		double a2 = 4 * Math.tan(180/numOfSide);
		return a1/a2;
	}
	public static int getNumofObjects() {
		return numOfObjects;
	}
	

}
