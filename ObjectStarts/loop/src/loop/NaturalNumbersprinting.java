package loop;
import java.util.Scanner;
public class NaturalNumbersprinting {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the last number : ");
		int n = input.nextInt();
		printNumbers(n);
		int Sum = sum(n);
		System.out.println("sum of first 10 numbers : "+Sum);
		showMultiplication(n);
		 Fac(n);
		 sumOdd(n);
		 sumEven(n);
		 prime(n);

	}
	public static void printNumbers(int a) {
		for(int i = 1 ;i<=a;i++) {
			System.out.println(i);
		}
	}
	
	///sum of first 10 natural numbers;
	
	public static int sum(int b) {
		int sum = 0;
		for(int i = 1 ;i<=b;i++) {
			sum = sum + i;
		}
		return sum;
	}
	////multiplication table 
	
	public static void showMultiplication(int m) {
		for(int i = 1 ;i<=m;i++) {
			System.out.println(m+ " X " +i + "=" +(m * i) );
		}
	}
	////factorial 
	public static void Fac(int num) {
		int f = 1;
		
		for(int i = 1; i<=num;i++) {
			f = f*i;
		}
		System.out.println("Factorial is : "+f );
	}
	
	///sum od even integers
	
	public static void sumEven(int num) {
		int sum = 0;
		for(int i =2 ; i<= num ;i=i+ 2) {
			sum= sum + i;
		}
		System.out.println("sum of even = "+sum);
	}
	///sum odd integers
	public static void sumOdd(int num) {
		int sum = 0;
		for(int i =1 ; i<= num ;i=i+ 2) {
			if(i % 2 != 0) {
			sum= sum + i;
			}
			else {
				continue;
			}
		}
		System.out.println("sum of odd = "+sum);
	}
	////prime number
	public static void prime(int num) {
		for(int i = 2;i<=num/2;i++) {
			if(num % i == 0) {
				System.out.println("Not prime");
			}
			else {
				System.out.println("prime");
			}
		}
	}

}
