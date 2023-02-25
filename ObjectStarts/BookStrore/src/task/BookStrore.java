package task;
import java.util.Scanner;
public class BookStrore {

	public static void main(String[] args) {
		final double DiscountTeacher = 0.3;
		final double DiscountTalents = 0.3;
		final double DiscountStudents = 0.3;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to nabid bOOk Strore");
		String[] str = {"Java" , "Phython","cse115"};
		System.out.println("Which Book do you want ,Sir?");
		String choice = input.nextLine();

		if(str[0].toLowerCase().equals(choice.toLowerCase()))
		{
			System.out.println("You opted for :"+str[0]+ "Book");
			calculatePrice(str[0]);
		}
		else if(str[1].toLowerCase().equals(choice.toLowerCase())){
			System.out.println("You opted for :"+str[1]+ "Book");
			calculatePrice(str[1]);
		}
		else if(str[2].toLowerCase().equals(choice.toLowerCase()))
		{
			System.out.println("You opted for :"+str[2]+ "Book");
			calculatePrice(str[2]);
		}
		else {
			System.out.println("No Books found");
		}

		
	}


public static  void calculatePrice(String bookname) {
	Scanner input = new Scanner(System.in);
	double price = 200;
	System.out.println("Are you a student/teacher/talent");
	String answer = input.nextLine();
	
	 if(answer.toLowerCase().equals("teacher")) {
		 price = price - (price * 0.3);
		 showPrice(price);
	 }
	 else if(answer.toLowerCase().equals("students")) {
		 price = price - (price * 0.7);
		 showPrice(price);
	 }
	 else if(answer.toLowerCase().equals("talents")) {
		 price = price - (price * 0.5);
		 showPrice(price);
	 }
	 else {
		 System.out.println("Sorry you dont have any discount");
	 }
	
	 
	
}
public static void showPrice(double price) {
	System.out.println("You  have to pay "+price);
	
	System.out.println("Thanks for your shopping Sir!!!");
}
}