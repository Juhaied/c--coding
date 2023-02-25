
public class BoxDemo3 {

	public static void main(String[] args) {
	
		Box myBox1 = new Box();
		Box myBox2 = new Box();

		myBox1.depth = 5;
		myBox1.height = 6;
		myBox1.width = 4;
		
		System.out.println("Volume of first box");
		myBox1.volume();
		
		myBox2.depth = 6;
		myBox2.height = 6;
		myBox2.width = 5;
		
		System.out.println("Volume of second box");
		myBox2.volume();
	}

}
