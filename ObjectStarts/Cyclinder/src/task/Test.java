package task;

public class Test {

	public static void main(String[] args) {
		Cyclinder c1 = new Cyclinder(2.0, "Blue",2.0);
		System.out.println(c1);
		
		Circle one = new Circle(5.0 , "Pink");
		System.out.println(one);
		System.out.println(one.getArea());
		
		Cyclinder c2 = new Cyclinder(5.0,"White",2.5); 
		System.out.println(c2 +"===>>>"+c2.getVolume());

	}

}
