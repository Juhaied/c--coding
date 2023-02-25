package method;

public class PrintGrade {

	public static void PrintGrade(double grade)
	{
		if(grade>=93)
			System.out.println("A");
		else if(grade>=80)
			System.out.println("B");
		else
			System.out.println("F");
	
	}
	public static void main(String[] args) {

		System.out.print("Your grade is: ");
		PrintGrade(95.6);
		
		System.out.print("Your grade is: ");
		PrintGrade(46.6);
		System.out.print("Your grade is: ");
		PrintGrade(85.6);
		
	
		
	}

}
