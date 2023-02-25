package task;

public class Test {

	public static void main(String[] args) {
		System.out.println(" ==== Geometric object ======");
		System.out.println();
	Geometric g1 = new Geometric();
	
	System.out.println(g1);
	
Geometric g2 = new Geometric("Red",true);
	
	System.out.println(g2);
	
	System.out.println();
	
	System.out.println("==========Circle object==========");
	System.out.println();
	Circle c1 =  new Circle();
	System.out.println("Area = "+c1.getArea() +" Diameter =  "+c1.getDiameter() +"perimetr = "+c1.getPerimeter() + " Created = "+c1.getDateCreated());
	c1.printCircle();
	
System.out.println();

Circle c2 =  new Circle(5);
System.out.println("Area = "+c2.getArea() +" Diameter =  "+c2.getDiameter() +" perimetr = "+c2.getPerimeter() + " Created = "+c2.getDateCreated());
c2.printCircle();

System.out.println();

Circle c3 = new Circle(5,"red",true);
System.out.println("Area = "+c2.getArea() +" Diameter =  "+c2.getDiameter() +" perimetr = "+c2.getPerimeter() + " Created = "+c3.getDateCreated() + " color = "+c3.getColor() + " filled = "+c3.getFilled());
System.out.println();

c3.printCircle();

System.out.println();

System.out.println("===========>>>>>>Rectangle object<<<<<<<=========");

System.out.println();

Rectangle r1 =  new Rectangle();

System.out.println("area = "+r1.getArea() + " perimeter = "+r1.getperimeter());

System.out.println();

Rectangle r2 = new Rectangle(4,5," Pink",false);

System.out.println("area = "+r2.getArea() + " perimeter = "+r2.getperimeter() + " color = "+r2.getColor() + " Filled = "+r2.getFilled() );
System.out.println();

Geometric g5 = new Rectangle(2,3 ," red",true);

System.out.println(g5.getColor());
System.out.println(g5.getFilled());
System.out.println(g5.getDateCreated());
	}
}
