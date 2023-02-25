package array;
import java.util.Scanner;
public class FindingLargestElement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] ara =  new int[5];
		
		int max = ara[0];
		
		System.out.print("Enter the values:  ");
		for(int i = 0;i<ara.length;i++)
		{
			ara[i] = input.nextInt();
		}
		for(int i = 0;i<ara.length;i++)
		{
			
			System.out.print(ara[i]+" ");
			if(ara[i]>max) {
				max = ara[i];
			}
		}
		System.out.println();
		System.out.print("Max = "+max);

	}

}
