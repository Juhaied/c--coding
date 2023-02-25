package TASK;
import java.util.Scanner;
public class Seconds {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter seconds : ");
		int sec =  input.nextInt();
		
		int min = sec / 60;
		int remsec = sec % 60;
		
		System.out.println(sec+ " seconds is "+min + " minitues and "+ remsec + " seconds");

	}

}
