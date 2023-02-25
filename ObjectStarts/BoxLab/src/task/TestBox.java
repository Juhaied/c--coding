package task;

public class TestBox {

	public static void main(String[] args) {

		Box b1 =  new Box();
		System.out.println("=====Box1====");
		System.out.println(b1 +" volume = "+b1.volume());
        System.out.println();
        
		Box b2 = new Box(5);
		System.out.println("=====Box2======");
		System.out.println(b2 + "volume = "+b2.volume());
		System.out.println();
		
		Box b3 = new Box(5);
		System.out.println("======box3=====");
		System.out.println(b3 + "volume = "+b3.volume());
		System.out.println();
		
		System.out.println("b3 == b2 "+b3.equals(b2));
		System.out.println();
		
		Box b4 = new Box(b3);
		System.out.println("======box4=====");
		System.out.println(b4 + "volume = "+b4.volume());
		System.out.println();
		
		System.out.println("b4==b3"+b4.equalsto(b3));
		
		Box b5 = new Box(b4);
		System.out.println("======box5=====");
		System.out.println(b5 + "volume = "+b5.volume());
		System.out.println();
		
		System.out.println("b5==b4"+b5.equalsto(b3));
		
		
	}

}
