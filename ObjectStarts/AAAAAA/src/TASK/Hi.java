package TASK;
import java.util.Scanner;
public class Hi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println(" Enter a integer :");
		 int n = input.nextInt();
		 
		 if(n % 2 == 0) {
			 System.out.println("Hi even");
		 }
		 if(n % 5 == 0) {
			 System.out.println(" Hi five");
		 }
		 if(n % 6 == 0) {
			 System.out.println("Hi six");
		 }
		 else {
			 System.out.println("bye");
		 }
	}

}
