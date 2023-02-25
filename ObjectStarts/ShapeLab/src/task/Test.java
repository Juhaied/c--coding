package task;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("======>>>>>Shape<<<<<<=========");
		Shape s1 = new Shape(5,10);
		System.out.println(s1.getArea());
		System.out.println();
		System.out.println("=======>>>>Rectangle <<<<<<=========");
		System.out.println();
		Shape s2 = new Rectangle(5,10);
		System.out.println(s2 + " Area = "+s2.getArea());
		
		System.out.println();
		Shape s3 = new Rectangle(7,10);
		System.out.println(s3 + " Area = "+s3.getArea());
		
		System.out.println();
		System.out.println("========>>>>Circle<<<<=======");
		System.out.println();
		
		Shape s4 = new Circle(5);
		System.out.println(s4 + " Area  = "+s4.getArea());
		
		Circle c1 = new Circle(6);
		System.out.println(c1 + " Area = "+c1.getArea());
		
		
	}

}
