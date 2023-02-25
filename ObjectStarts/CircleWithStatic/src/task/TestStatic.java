package task;

public class TestStatic {

	public static void main(String[] args) {
	Circle c1 = new Circle();
	System.out.println(c1 + "===>>> "+c1.getArea());

	Circle c2 = new Circle(7);
	System.out.println(c2 + "===>>> "+c2.getArea());
	Circle c3 = new Circle(5);
	System.out.println(c3 + "===>>> "+c3.getArea());
	Circle c4 = new Circle(-7);
	System.out.println(c4 + "===>>> "+c4.getArea());
	
	
	}

}
