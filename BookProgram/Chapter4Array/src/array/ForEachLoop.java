package array;
import java.util.Scanner;
public class ForEachLoop {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
		int[] a =new int[3];
		
		System.out.print("enter : ");
		
		for(int i = 0;i<a.length;i++)
		{
			a[i]= input.nextInt();
		}
		for(int e : a)
		{
			System.out.print(e+" ");
		}
		

	}

}
