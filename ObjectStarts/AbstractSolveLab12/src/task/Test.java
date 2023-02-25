package task;

public class Test {

	public static void main(String[] args) {
		Shape s1 = new Circle(6);

		System.out.println(s1 + " Area = "+s1.getArea());
		
		Circle c2 = new Circle(5);
		
		Shape s2;
		s2 = c2;
		
		System.out.println(s2 + " Area = "+s2.getArea());
		System.out.println(c2.circleCounter());
		System.out.println(c2.getArea());
		
		
		Shape s3 = new Rectangle(5,5);
		System.out.println(s3.getArea());
	}

}
