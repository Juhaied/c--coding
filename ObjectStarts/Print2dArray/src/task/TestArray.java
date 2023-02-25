package task;

public class TestArray {

	public static void main(String[] args) {
		Array a1 = new Array();
		
		int[][] a2 = a1.printArray();
		
		for(int i =0;i<a2.length;i++) {
			for(int j = 0;j<a2[i].length;j++) {
				System.out.println(a2);
			}
			 
		}
	
	}

}