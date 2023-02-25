package method;

public class FirstProgram {

	public static int sum(int i1, int i2)
	{
		int result = 0;
		
		for(int i = i1;i<=i2;i++)
		{
			result += i;
		}
		return result;
	}
	public static int sub(int i1,int i2)
	{
		int sub = 0;
	
		sub = i2 - i1;
		return sub;
	}
	
	public static int mul(int i1,int i2)
	{
		int mul = 1;
		for(int i = i1 ;i<=i2;i++)
		{
			mul = mul *i; 
		}
		return mul;
	}
	public static void main(String[] args) {
		System.out.println("Sum for 1 to 10 is "+(sum(1, 10)));
		System.out.println("Sum for 1 to 10 is "+(mul(1, 5)));
        System.out.print(sub(1,5));
	}

}
