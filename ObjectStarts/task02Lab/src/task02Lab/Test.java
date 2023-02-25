package task02Lab;

public class Test {

	public static void main(String[] args) {
		ResizableCircle r1 = new ResizableCircle(6);
		System.out.println("Radius: " + r1.radius);
		System.out.println("Area: " + r1.getArea());
		System.out.println("perimeter: " + r1.getPerimeter());
		System.out.println();
		
		System.out.println("After calling resizableCircle class");
		System.out.println();
		
		r1.resize(50);
		System.out.println("Radius: " + r1.radius);
		System.out.println("Area: " + r1.getArea());
		System.out.println("perimeter: " + r1.getPerimeter());
		System.out.println();
		
		ResizableCircle r2 = new ResizableCircle(10);
		System.out.println("Radius: " + r2.radius);
		System.out.println("Area: " + r2.getArea());
		System.out.println("perimeter: " + r2.getPerimeter());
		System.out.println();
		
		System.out.println("After calling resizableCircle class");
		System.out.println();
		
		r2.resize(50);
		System.out.println("Radius: " + r2.radius);
		System.out.println("Area: " + r2.getArea());
		System.out.println("perimeter: " + r2.getPerimeter());
		System.out.println();
		
	}

}
