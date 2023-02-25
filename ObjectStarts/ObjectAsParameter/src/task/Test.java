package task;

public class Test {

	public int a,b;
	
	public Test(int i ,int j) {
		a = i;
		b= j;
	}
	public boolean isEqualto(Test o) {
		if((o.a == a) && (o.b == b))
			return true;
		else
			return false;
	}
}
