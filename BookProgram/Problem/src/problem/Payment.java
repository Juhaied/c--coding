package problem;
import java.util.Scanner;

public class Payment {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter interest rate: ");
		double annualInterest = input.nextDouble();
		
		double monthlyInterest = annualInterest / 1200;
		
		System.out.print("Enter loan amount: ");
	   double loanAmount = input.nextDouble();
	   System.out.print("Enter years: ");
	   int year = input.nextInt();
	   
	   double monthlyPayment = loanAmount * monthlyInterest /( 1-
			   1/Math.pow(1 +monthlyInterest , year * 12));
	   
	   double totalPayment = monthlyPayment * year * 12;
	   
	   System.out.print("The monthly payment is"+(int)(monthlyPayment*100)/100.0);
	   System.out.println("The total payment is $" +(int)(totalPayment * 100) / 100.0); 
	   
	}

}
