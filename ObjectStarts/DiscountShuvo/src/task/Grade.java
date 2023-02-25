package task;
import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		System.out.println("enter a charchter: ");
		char ch = input.next().charAt(0);
		switch(ch) {
		case 'A' :
			System.out.println("Excellent");
			break;
		case 'B' :
			System.out.println("Good");
			break;
		case 'C' :
			System.out.println("Average");
			break;
		case 'D' :
			System.out.println("Poor");
			break;
		default:
			System.out.println("FailTush");
			
		}

	}

}
