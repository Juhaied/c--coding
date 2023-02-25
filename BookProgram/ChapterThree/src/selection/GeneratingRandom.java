package selection;
import java.util.Scanner;
public class GeneratingRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner input = new Scanner(System.in);
   System.out.print("enter :");
   int n = input.nextInt();
   
   for(int i = 1 ; i<=n;i++)
   {
	   int N = (int)(Math.random()*10)+40;
	   System.out.println(N);
   }
	}

}
