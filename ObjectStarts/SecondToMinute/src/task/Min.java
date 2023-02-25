package task;

public class Min {
public int min;
private int sec;

public Min(int sec) {
	this.sec = sec;
}
public void setSec(int Sec) {
	this.sec = sec;
}
public int getSec() {
	return sec;
}
public int min() {
	return sec/60 ;
}
}
