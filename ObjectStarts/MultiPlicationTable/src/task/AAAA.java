package task;

public class AAAA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String s = "Hi, Good Morning";  
		   System.out.println(m(s));  
		   }
	public static int m(String s) 
	{
		int count = 0;
		for (int i = 0; i < s.length(); i++) 
			if (Character.isUpperCase(s.charAt(i)))
				count++;
		
	return count;
	   } 

	}


