
public class TestCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		
		System.out.println(c1 + " Area of c1 = "+c1.getArea());;

		Circle c2 = new Circle(5);
		
		System.out.println(c2 + " Area of c2 = "+c2.getArea());
	}

}
