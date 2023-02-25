package task;

public class Test {
    
    public static void main(String[] args)
    
    {
        
    	
    	Movable m1 = new MovablePoint(1, 2, 1, 1);  
    	
    	System.out.println(" Normal points");
    	
    	System.out.println();
    	
        System.out.println(m1);
        
        System.out.println();
        
        System.out.println("After calling any method");
        
        System.out.println();
        
        m1.moveLeft();
        m1.moveDown();
        
        System.out.println(m1);
        
           System.out.println();
        
           System.out.println("Creating circle objects");
           
        System.out.println();
        
        Movable m2 = new MovableCircle(1, 2, 2, 2, 5);
        
        System.out.println(" Normal points");
        
    	System.out.println();
    	
        System.out.println(m2);
        
        System.out.println("After calling any method");
        System.out.println();
        
        m2.moveRight();
       
        m2.moveUp();
        m2.moveRight();
        System.out.println(m2);
    }
}