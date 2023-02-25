package task;

public class CallByValue {

	public static void main(String[] args) {
	Test ob = new Test(15,20);
	
	System.out.println("a and b before call");
	System.out.println(ob.a+ " " +ob.b);
	
	ob.meth(ob);
	System.out.println("a and b after call");
	System.out.println(ob.a+ " " +ob.b);

	}

}
