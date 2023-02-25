package task;
//parents class of Bike classs
public class Bicycle {
	public int cadence;
	public int speed ;
	public int gear ;
	
	public Bicycle() {
		cadence = 0;
		speed = 0;
		gear = 1;
	}
	
	public Bicycle(int cadence,int speed ,int gear) {
		this.cadence  = cadence;
		this.speed = speed;
		this.gear = gear;
	}
	public void changeCadence(int newvalue) {
	cadence =cadence - newvalue;
	}
	public void changeGear(int newvalue) {
		gear = gear + newvalue;
	}
	
	public void speedUp(int speedUp) {
		speed = speed + speedUp;
	}
	public void speedDown(int speedDown) {
		speed = speed- speedDown;
	}
	public String toString() {
		return "Bicycle[ Cadence = " +cadence + " speed = "+speed + " Gear = "+gear +"]";
	}

}
