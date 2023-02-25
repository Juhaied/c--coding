package method;

public class INcrement {

	public static int Increment(int n) {
		n++;
		System.out.println("Inside the method n = "+n);
		return n;
	}
	public static void main(String[] args) {
		int x = 1;
		System.out.println("Before call x is "+x);
		Increment(x);
		
		
		

	}

}
