package TASK;
import java.util.Scanner;
public class SubtractionFive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int NUM_OF_QUES = 5;
		int count = 0;///correct answer count
		int quesCount = 0;
		
		while(quesCount<NUM_OF_QUES) {
			int num1 = (int)(Math.random() * 10);
			int num2 = (int)(Math.random() * 10);
			
			if(num2>num1) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}
			
			System.out.println("What is "+num1 + " - " +num2 +" = ");
			int answer= input.nextInt();
			
			if(num1 - num2 == answer) {
				System.out.println(" Yes you are right "+num1 + " - "+num2 +" = "+(num1 - num2));
				count++;
			}
			else 
				System.out.println("You are wrong ."+num1 + " - "+ num2 + " should be "+(num1 - num2));
			quesCount++;
			System.out.println("Correct answer = "+count);
		
		}

		
	}

}
