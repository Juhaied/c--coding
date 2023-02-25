package task;

public class Test {

	public static void main(String[] args) {
		Football f1 = new Football();
		f1.setName("Nabid");
		f1.setxLoc("Right back");
		f1.setyLoc("Right wing");
		f1.setNumber(10);
		
		System.out.println("Name = "+f1.getName()+ " X position = "+f1.getxLoc() +  " Y position = "+f1.getyLoc() + " Jersey number = "+f1.getNumber() + " change = "+f1.run());
		
		

	}

}
