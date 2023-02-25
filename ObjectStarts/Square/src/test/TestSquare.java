package test;

public class TestSquare {

	public static void main(String[] args) {
		Square s1 = new Square(5);
		
		System.out.println("Square = "+s1.getSquare());

		Square s2 = new Square(25);
		
		System.out.println("Sqrt = "+s2.getSqrt());
		System.out.println("square = "+s2.getSquare());
	}

}
