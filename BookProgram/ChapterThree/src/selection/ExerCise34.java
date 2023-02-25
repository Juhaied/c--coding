package selection;
import java.util.Scanner;
public class ExerCise34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner input = new Scanner(System.in);
   
   System.out.print("how many ?");
   int n = input.nextInt();
   int i = 1;
   
   for(i = 1;i<=n;i++)
   {
	   int N = (int)(Math.random()*12+1);
	   System.out.print(N);
	   System.out.print("\n");
	   switch(N)
	   {
	   case 1:
		   System.out.println("January");
		   break;
	   case 2:
		   System.out.println("February");
		   break;
	   case 3:
		   System.out.println("March");
		   break;
	   case 4:
		   System.out.println("April");
		   break;
	   case 5:
		   System.out.println("May");
		   break;
	   case 6:
		   System.out.println("June");
		   break;
	   case 7:
		   System.out.println("July");
		   break;
	   case 8:
		   System.out.println("August");
		   break;
	   case 9:
		   System.out.println("September");
		   break;
	   case 10:
		   System.out.println("oct");
		   break;
	   case 11:
		   System.out.println("Jry");
		   break;
	   case 12:
		   System.out.println("dec");
		   break;
	   }
   }
  
	}

}
