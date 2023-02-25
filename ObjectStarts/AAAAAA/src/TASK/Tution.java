package TASK;

public class Tution {

	public static void main(String[] args) {
		
		double tution = 10000;
		int year = 0;
		
		while(tution < 20000) {
			tution = tution * 1.07;
			year++;
		}
		System.out.println("tution will be doubled in "+year +"years and the amount is "+((int)(tution * 100))/100.0);
		
	}

}
