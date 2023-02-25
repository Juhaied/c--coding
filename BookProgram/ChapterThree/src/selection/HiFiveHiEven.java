package selection;
import java.util.Scanner;

public class HiFiveHiEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input = new Scanner(System.in);
     
     System.out.print("Enter an Integer: ");
     int num = input.nextInt();
     
     if(num%2 == 0) {
    	 System.out.println("hi even");
     }
      if(num%2 == 0) {
    	 System.out.println("hi five");
     }
	}

}
