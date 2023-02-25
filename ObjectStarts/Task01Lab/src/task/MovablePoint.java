package task;
public class MovablePoint implements Movable {
    
    int x, y, xSpeed, ySpeed;     
    

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    
    public void moveUp() {
       y = y + ySpeed;
    }

    @Override
    public void moveDown() {
        y = y - ySpeed;
    }

    @Override
    public void moveLeft() {
        x =x -  xSpeed;
    }

    @Override
    public void moveRight() {
        x =x +  xSpeed;
    }

       
    public String toString() {
      return "MovablePoints[ X = "+x + " ,Y = "+y + " ,Xspeed = "+xSpeed + " ,YSpeed = "+ySpeed +"]";
    }
}
