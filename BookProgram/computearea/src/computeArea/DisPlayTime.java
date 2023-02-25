package computeArea;
import java.util.Scanner;

public class DisPlayTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input  = new Scanner(System.in);
		
		int sec,min,rem;
		
		System.out.print("Enter seconds: ");
		sec = input.nextInt();
		
		min = sec / 60;
		rem = sec % 60;
		
		System.out.println(sec+ " is" +min +"minitues" + "and" + rem +"sec");
		
	
		

	}

}
