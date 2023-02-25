package task;
import java.util.Scanner;
public class Revenue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter price: ");
		double price = input.nextDouble();
		System.out.println("enter quantity: ");
		double quantity = input.nextDouble();
		
		double revenue = price * quantity;
		System.out.println("Revenue without discount : "+revenue);
		double discount=0;
		if(revenue>5000) {
			 discount = revenue * .10;
			revenue = revenue - discount;
		}
		System.out.println("Revenue after discount : "+revenue);
		System.out.println("Discount = "+discount);
	}

}
