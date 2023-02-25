package task;

public class ShiftingElements {

	public static void main(String[] args) {
		int[] ara = {0,1,2,3,4}; 
		int temp = ara[0];
		
		for(int i = 1;i<ara.length;i++) {
			ara[i - 1] = ara[i];
		}
		System.out.println(ara[0]);
		
		ara[ara.length - 1]= temp;
		System.out.println(ara[4]);
		for(int i =0 ;i<ara.length;i++) {
		System.out.println(ara[i]);
		}

	}

}
