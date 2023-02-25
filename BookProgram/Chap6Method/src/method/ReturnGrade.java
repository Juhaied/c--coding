package method;

public class ReturnGrade {
	 public static char getGrade(double score) { 
		 if (score >= 90.0) 
			 return 'A'; 
		 else if (score>=86)
			 return 'B';
		 else 
			 return 'F';
	 }
	public static void main(String[] args)
	{
	 System.out.print("The grade is " + getGrade(78.5)); 
	 
	 System.out.print("\nThe grade is " + getGrade(59.5)); 
	 } 
	 
	 
	 
		 }  


	


