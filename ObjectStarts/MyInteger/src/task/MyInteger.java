package task;

public class MyInteger {
	private int value;
	
	public MyInteger(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public boolean isEven() {
		if(value % 2 == 0) {
			return true;
		}
		else 
			return false;
	}
	public boolean isOdd() {
		if(value % 2 != 0) {
			return true;
		}
		else 
			return false;
	}
	

}
