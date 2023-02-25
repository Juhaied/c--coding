package task;
///sub class or child class of bicycle class
public class Bike extends Bicycle {

	public int seatHeight;
	
	public void seatHeight(int newValue) {
		seatHeight = newValue;
	}
	public Bike(int cadence,int speed ,int gear,int seatHeight) {
		super(cadence,speed,gear);
		this.seatHeight = seatHeight;
	}
	public void seatUp(int up) {
		seatHeight += up;
	}
	public String toString() {
		return "Bike[ Cadence = "+cadence + " speed = "+speed + " Gear = "+gear + " Seat height = "+seatHeight +"]";
	}
	
}
