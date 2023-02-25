package task;

public abstract class TestBox {

	public static void main(String[] args) {
		Box b1 = new Box();
		
		System.out.println(b1.volume());
		
		Box b2 = new Box(5);
		System.out.println(b2.volume());
		
		System.out.println(b1.equals(b2));

	}

}
