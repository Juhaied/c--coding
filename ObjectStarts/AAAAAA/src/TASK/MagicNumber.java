package TASK;
import java.util.Scanner; 
public class MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = (int)(Math.random() * 101); 
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Guess a magic number between 0 and 100");
		
		int guess = -1;
		
		while (guess != number) { 
			
			System.out.println("enter your guess: ");
			guess = input.nextInt();
			
			if(guess == number) {
				System.out.println("yes you are right the number is "+number);
			}
			else if(guess>number) {
				System.out.println("Too high");
			}
			else {
				System.out.println("too low");
			}
		}
		
		}
	}


