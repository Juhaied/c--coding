
public class Circle {

	public double radius;
	public String color;
	
	public Circle(double radius) {
		this.radius = radius;
		
	}
	
	public Circle(double r,String s) {
		this.radius = r;
		this.color = s;
	}
	public double getArea() {
		 return (Math.PI * radius*radius);
	}
	public double getCircumference(double r) {
		return 2 * Math.PI *radius;
	}
	
	
}
