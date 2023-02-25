package task;

public class AreaCalculator {

	public static void main(String[] args) {
		Area circle = new Area(2.0);
		System.out.println("Area of circle = "+circle.AreaOfCircle());
        System.out.println();
        
        Area square = new Area(4,7);
        System.out.println("Area of square = "+square.AreaOfSquare());
        System.out.println();
        
        Area triangular = new Area(2.0,3);
        System.out.println("Area of triangular = "+triangular.AreaOfTriangular());
        System.out.println();
        
        Area cylinder = new Area(2.0,3.5);
        System.out.println("Area of cyclinder = "+(((int)cylinder.AreaOfCyclinder()*100)/100));
	}

}
