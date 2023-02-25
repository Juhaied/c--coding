package computeArea;
import java.util.Scanner;

public class ComputeAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input = new Scanner (System.in);
     
     double num1,num2,num3,avg;
     
     System.out.print("Enter three Numbers:  ");
     num1=input.nextDouble();
     num2=input.nextDouble();
     num3=input.nextDouble();
     
     avg = (num1 + num2 + num3)/3;
     
     System.out.print("The average of" + num1 + "," +num2  +" " +"and" +num3 + "is" +avg);
	}

}
