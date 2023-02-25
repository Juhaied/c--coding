package task;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] ara = new int[10];
		int sum = 0;
		for(int i = 0 ; i<10;i++) {
			System.out.print("ara[" + i + "]= ");
			ara[i] =  input.nextInt();
			sum = sum + ara[i];
		}
		System.out.println("sum = "+sum);
		
		double average = sum / 10;
		
		System.out.print(" Average = "+average);
		
		int count = 0;
		for(int i = 0 ; i<10;i++) {
			if(ara[i]>average) {
				count++;
				System.out.println("the numbers are : "+ara[i]);
			}
		}
		System.out.println("Numbers greater than avg are: "+count);
		

	}

}
