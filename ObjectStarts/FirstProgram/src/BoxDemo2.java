
public class BoxDemo2 {

	public static void main(String[] args) {
		Box myBox1 = new Box();
		Box myBox2 = new Box();
		
		//Assigin values to myBox1 instance variables
		
		myBox1.depth = 10;
		myBox1.height = 5;
		myBox1.width = 4;
		
		double v1 = myBox1.depth * myBox1.height* myBox1.width;
		
		System.out.println("Box one volume  = "+v1);
		
		myBox2.depth = 6;
		myBox2.height = 5;
		myBox2.width = 2;
		
		double v2 = myBox2.depth * myBox2.height* myBox2.width;
		
		System.out.print("Box one volume  = "+v2);
	}

}
