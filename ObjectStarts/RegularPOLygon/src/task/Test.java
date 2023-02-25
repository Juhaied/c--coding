package task;

public class Test {

	public static void main(String[] args) {
	Polygon p1 = new Polygon();
	p1.setnumOdSide(6);
	p1.setSide(8);
	System.out.println("Perimeter of p1 = "+p1.getPerimeter());
	System.out.println(p1.getNumofObjects());
	Polygon p2 = new Polygon(6,5);
	
	System.out.println("perimter of p2 = "+p2.getPerimeter());
	System.out.println(p2.getNumofObjects());
	
	System.out.println("Area of p2 = "+p2.getArea());
	
	Polygon p3 = new Polygon(10,4,5.6,6.3);
	System.out.println("Area = "+p3.getArea());
	System.out.println("Perimeter = "+p3.getPerimeter());
	}

}
