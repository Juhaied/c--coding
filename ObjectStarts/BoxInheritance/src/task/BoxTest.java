package task;

public class BoxTest {

	public static void main(String[] args) {
		Box b1 = new Box(5);
		System.out.println(b1 + "volume ===>>>"+b1.getVoloume());
        System.out.println();
        
        Box b2 = new Box(5,4,3);
        System.out.println(b2 + "volume ===>>>"+b2.getVoloume());
        System.out.println();
        
        System.out.println("b1 == b2???"+b1.equals(b2));
        System.out.println();
        
        Box b3 = new Box(5,4,3);
        System.out.println(b3 + "volume ===>>>"+b3.getVoloume());
        System.out.println();
        
        BoxWeight w1 = new BoxWeight(5,4,3,2);

       
        System.out.println("height = "+w1.getHeight() + " width = "+w1.getWidth() + " depth = "+w1.getDepth() + " Volume = "+w1.getVoloume() +" Area = "+w1.area());
        BoxColor c1 = new BoxColor(5,4,3,2,"Red");
        
        System.out.println("height = "+c1.getHeight() + " width = "+c1.getWidth() + " depth = "+c1.getDepth() + " Volume = "+c1.getVoloume() +" Area = "+c1.area() + " color = "+c1.getColor());
	}

}
