package fan;

public class Fan {

	final int slow = 1;
	final int mid = 2;
	final int fast = 3;
	private int speed;
	private boolean on ;
	private double radius;
	private String color;
	
	public Fan() {
		 speed = 1;
	on =true;
		radius=5;
		color = "Blue";
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setOnOfff(boolean on) {
		this.on = true;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setColor(String color) {
		
		this.color = color;
		
	}
	public int getSpeed() {
		return speed;
	}
	public boolean getOnOfff() {
		return on;
	}
	public double getRadius() {
		return radius;
	}
	public String getColor() {
		return color;
	}
	public void speedUp() {
		if(on && speed <3) {
		speed++;
		}
	}
	public String toString() {
		return "Fan[ On = "+on + " Speed = "+speed + " Radius = "+radius + " Color = "+color +"]";
	}
}
