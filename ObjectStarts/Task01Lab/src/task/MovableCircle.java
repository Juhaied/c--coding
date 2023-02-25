package task;

public class MovableCircle implements Movable {

   
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center      = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
   
    public void moveUp() {
        center.y =center.y + center.ySpeed;
    }

    public void moveDown() {
        center.y = center.y  - center.ySpeed;
    }

    public void moveLeft() {
        center.x =center.x - center.xSpeed;
    }

    public void moveRight() {
        center.x = center.x + center.xSpeed;        
    }
    public String toString() {
        return "MovableCircle[X = "+center.x + " ,Y = "+center.y + " ,Xspped = "+center.xSpeed + " ,Yspeed = "+center.ySpeed +" Radius = "+radius + "]";
    }
    
}
