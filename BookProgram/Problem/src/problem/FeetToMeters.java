package problem;
import java.util.Scanner;
public class FeetToMeters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
	System.out.print("Enter feet: ");
	double feet = input.nextDouble();
	
	double meter = 0.305 * feet;
	System.out.print(feet+ "is equal to"+meter);
	
	
	
	
	}

}
