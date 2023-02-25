
public class BoxDemo {

	public static void main(String[] args) {
		
		//creating object
		
		Box myBox = new Box();//my box will be an instance of the box from now
		
		double vol;
		
		myBox.width = 10;
		myBox.height = 7;
		myBox.depth = 8;
		
		vol = myBox.depth*myBox.height*myBox.width;
		
		System.out.println("Volume is =  " +vol);

	}

}
