package task;
import java.util.Scanner;
public class ATM {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter you id no: ");
	long id = input.nextInt();
	if(id>=1000000 && id<=6000000) {
		System.out.println("Enter your password");
		String str = input.nextLine();
		
	}
	else {
		System.out.println("Invalid password");
	}
	System.out.println("Login successfull");

	}

}
