package selection;
import java.util.Scanner;
public class Zodiacsign {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a year: ");
		
		int year = input.nextInt();
		
		switch(year % 12) {

		case 0 : 
			System.out.println("monkey");
		break;
		
		case 1 : 
			System.out.println("roster");
		break;
		
		case 2 : 
			System.out.println("doh");
		break;
		case 3 : 
			System.out.println("lion");
		break;
		case 4 : 
			System.out.println("tiger");
		break;
		case 5 : 
			System.out.println("crow");
		break;
		case 6 : 
			System.out.println("monkey");
		break;
		case 7 : 
			System.out.println("rabbit");
		break;
		case 8 : 
			System.out.println("shark");
		break;
		case 9 : 
			System.out.println("bird");
		break;
		case 10 : 
			System.out.println("ox");
		break;
		}

	}

}
