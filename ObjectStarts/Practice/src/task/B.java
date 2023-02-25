package task;

public class B extends A {

	int i;
	
	public B(int a ,int b) {
		super.i = a;
		i = b;
	}
	public void show() {
		System.out.println(" i in super " + super.i);
		System.out.println("i in sub "+i);;
	}
}
