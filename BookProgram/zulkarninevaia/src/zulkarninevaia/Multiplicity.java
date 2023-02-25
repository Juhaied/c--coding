package zulkarninevaia;

public class Multiplicity {

	public static void main(String[] args) {
		int a = 6;
		int rslt = getMul(a);
		System.out.println(rslt);
		getDiv(a);
		
		
		
	}
	public static int getMul(int k) {
		k = k* 100;
		return k;
	}
	public static void getDiv(int c) {
		c = c/ 2;
		System.out.println(c);
	}
	
}
