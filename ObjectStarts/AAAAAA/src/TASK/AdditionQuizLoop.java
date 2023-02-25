package TASK;
import java.util.Scanner;
public class AdditionQuizLoop {

	public static void main(String[] args) {
		
     Scanner  input = new Scanner(System.in);
     
     int n1 = (int)(Math.random() * 10);
     int n2 = (int)(Math.random() * 10);
     
     System.out.println(" What is "+n1 + " + "+n2 + "? = ");
     int answer = input.nextInt();
     
     while(n1 + n2 != answer) {
    	 System.out.println("Wrong asnwer.Try again What is "+n1 + "+ " +n2 + "?");
    	 answer = input.nextInt();
     }

     System.out.println(" you got it");
	}

}
