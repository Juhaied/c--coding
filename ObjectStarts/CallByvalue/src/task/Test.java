package task;

public class Test {
int a ,b ;
	public Test(int i,int j) {
		a = i;
		b = j;
	}
	public void meth(Test o) {
		o.a= o.a * 2;
		o.a= o.a/2;
	}
}
