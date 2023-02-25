package problem;
import java.util.Scanner;


public class CylinderVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner input = new Scanner(System.in);
   final double PI = 3.1416;
   
   System.out.print("Enter radius & length of the cylinder: ");
   double radius = input.nextDouble();
   double length = input.nextDouble();
   
   double area = radius * radius * PI;
   
   System.out.println("area = "+(int)(area*100)/100.0);
   
   double volume = area * length;
   
   System.out.print("Volume = "+(int)(volume*100)/100.0);
   
   
   
	}

}
