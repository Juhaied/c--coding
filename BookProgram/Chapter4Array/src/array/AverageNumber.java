package array;
import java.util.Scanner;
public class AverageNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many input ? " );
		
		int n = input.nextInt();
		
		double[] ara = new double[n];
		
		double sum = 0;
		int count = 0;
		for(int i = 0; i<n;i++)
		{
			ara[i]= input.nextDouble();
			
			sum = sum + ara[i];
		}
		for(int i = 0; i<n;i++)
		{
			System.out.print(ara[i] + " ");
		}
		System.out.println();
		System.out.println("Sum = "+sum);
		
		double average = sum/n;
		
		System.out.println("Average =  "+average);
		
		for(int i = 0; i<n;i++) {
			if(ara[i]>average) {
				count++;
			}
		}
		System.out.println("The numbers more than agerage is  "+count);
	}

}
