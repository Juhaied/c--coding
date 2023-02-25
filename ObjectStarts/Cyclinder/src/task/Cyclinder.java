package task;

public class Cyclinder extends Circle {
public double height ;
public Cyclinder(double height) {
	this.height = height;
}
public Cyclinder(double radius,String color,double height) {
	super(radius,color);
	this.height = height;
	
}
public double getArea() {
	double area = 2 * Math.PI * radius * height + 2 * super.getArea();
	return area;
}
public double getVolume() {
	return super.getArea() * height;
}
public String toString() {
	return "Cyclinder[ radius = "+radius + " color = "+color + " Height ="+height +"]";
}
}
