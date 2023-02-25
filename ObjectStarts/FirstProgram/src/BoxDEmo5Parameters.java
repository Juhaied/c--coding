
public class BoxDEmo5Parameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box myBox1 = new Box();
		
		
		
		double vol1 = myBox1.volume();
		
		System.out.println("Volume 1 = "+vol1);
		
		Box myBox2 = new Box();
		
		myBox2.setDim(5, 5, 5);
		
		double vol2 = myBox2.volume();
		
		System.out.println("Voulme 2 = "+vol2);
		

	}

}
