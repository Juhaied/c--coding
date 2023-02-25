package TASK;
import java.util.Scanner;
public class SentinelValue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a integer between 1 to 9 .if you enter 0 the loop will end");
		int data = input.nextInt();
		int sum = 0;
		
		while (data != 0) {
			sum =  sum + data;
			
			System.out.println("Enter a integer between 1 to 9 .if you enter 0 the loop will end");
			 data = input.nextInt();
			 
		}
				
System.out.println("Sum = "+sum);
	}

}
