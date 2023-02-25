package task;

public class Test {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		System.out.println("Triangle1 = "+t1.getArea());
		
		Triangle t2 = new Triangle(1,3,7);
		System.out.println(t2.getArea());

	}

}
