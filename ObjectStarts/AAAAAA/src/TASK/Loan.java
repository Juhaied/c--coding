package TASK;
import java.util.Scanner;
import javax.swing.*;
public class Loan {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter annualInterest rate : ");
		double rate = input.nextDouble();
		
		System.out.println(" years ====>>>>>");
		int year = input.nextInt();
		
		System.out.println("loan amount ");
		double amount = input.nextDouble();
		
		double monthlyInterestRate = rate / 1200;
		
		double monthlyPayment = (amount *monthlyInterestRate)/(1-1/(Math.pow(1 + monthlyInterestRate,year * 12)));
		double totalPayment = monthlyPayment * year * 12;
		
		System.out.println("Monthly payment = "+monthlyPayment);
		System.out.println(" total Payment = "+totalPayment);
		
		

	}

}
