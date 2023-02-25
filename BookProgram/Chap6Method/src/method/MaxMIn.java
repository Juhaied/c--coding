package method;

public class MaxMIn {

	public static int MaxMin(int num1,int num2)
	{
		int result ; 
		
		if(num1>num2) {
			result = num1;
		}
		else {
			result = num2;
		}
		return result;
		
	}
	public static void main(String[] args) {
		int i = 5,j = 19;
		int z =MaxMin(i,j);
		System.out.print("Max =  "+z);

	}

}
