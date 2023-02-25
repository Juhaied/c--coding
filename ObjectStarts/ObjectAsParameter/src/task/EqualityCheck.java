package task;

public class EqualityCheck {

	public static void main(String[] args) {
		Test ob1 = new Test(22,33);
		
		
		Test ob2 = new Test(22,33);
		
		System.out.println("ob1 and ob2 are equal "+ob1.isEqualto(ob2));
		
		Test ob3 = new Test(23,33);
		System.out.println("ob1 and ob2 are equal "+ob1.isEqualto(ob3));
	}

}
