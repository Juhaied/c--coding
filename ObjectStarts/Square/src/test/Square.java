package test;

public class Square {
public int i;

public Square(int i) {
	this.i = i;
}
public int getSquare() {
	return i* i;
}
public int getSqrt() {
	return (int) (Math.sqrt(i));
}
}
