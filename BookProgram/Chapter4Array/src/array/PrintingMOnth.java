package array;
import java.util.Scanner;
public class PrintingMOnth {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] months = {"January", "February","March","April","May","june","July", "December"};
		System.out.print("Enter a month number (1 to 12): ");
		int monthNumber = input.nextInt();
		System.out.println("The month is " + months[monthNumber - 1]);
	}

}
