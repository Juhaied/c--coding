package task;

public class Test {

	public static void main(String[] args) {
		Linear l1 = new Linear(1,2,3,4,5,6);
		System.out.println(l1.isSolvable());
		System.out.println(l1.getX());
		System.out.println(l1.getY());
		
		Linear l2 = new Linear(1,1,2,2,5,6);
		System.out.println(l2.isSolvable());
		System.out.println(l2.getX());

	}

}
