
public class BoxDemo4Return {

	public static void main(String[] args) {
		Box myBox1 = new Box();
		Box myBox2 = new Box();

		myBox1.depth = 5;
		myBox1.height = 6;
		myBox1.width = 4;
		
		System.out.println("Volume of first box");
		double vol1 = myBox1.volume();
		System.out.println(vol1);
		
		myBox2.depth = 6;
		myBox2.height = 6;
		myBox2.width = 5;
		
		System.out.println("Volume of second box");
		double v2 = myBox2.volume();

		System.out.println(v2);
	}

}
