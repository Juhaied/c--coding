package task;

public class SportsCar extends Car {

	public int speed = 200;
	
	public void ShowSpeed() {
		System.out.println("Speed of super class= "+super.speed);
		System.out.println("Speed of sub Class = "+speed);
	}
}
