package TASK;
import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int lottery = (int)(Math.random() * 100);
		
		
		System.out.println("Your guesss  = ");
		int answer = input.nextInt();
		
		int digit1 = lottery / 10;
		int digit2 = lottery % 10;
		
		int guess1 = answer /10;
		int guess2 = answer % 10;
		
		if (answer ==  lottery) {
			System.out.println("Exact order !!!! You win 1000000");
		}
		else if(digit1 == guess2 && guess1 ==digit2) {
			System.out.println("Match allll !!!! You win 30000");
		}
		else if(digit1 ==guess1 || guess1 == digit2 || digit2 == guess2 || digit1 == guess2) {
			System.out.println("One digit match ..  win 100");
		}
		else {
			
			System.out.println("sorry");
		}
		System.out.println(lottery);
	}

}
