package method;

public class Swap {
     public static void swap(int n1,int n2){
    	int temp = n1;
    	n1=n2;
    	n2=temp;
    	
    	System.out.print("After swap n1 is"+n1 + " n2 is "+n2);
     }
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		swap(num1,num2);

	}

}
