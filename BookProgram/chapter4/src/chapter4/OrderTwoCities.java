package chapter4;
import java.util.Scanner;
public class OrderTwoCities {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first city : ");
		 String city1 = input.nextLine();
		 
		 System.out.print("Enter second city : ");
		 String city2 = input.nextLine();

		 if(city1.compareTo(city2)<0)
		 {
			 System.out.print("The cities in the alphabetical order are  " +city1 + " then " + city2);
			 
		 }
		 else {
			 System.out.print("The cities in the alphabetical order are" +city2 + "then" + city1);
		 }
	}

}
