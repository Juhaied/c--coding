package TASK;
import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          
          int n1 = (int)(Math.random() * 10);
          int n2 = (int)(Math.random()*10);
          
          System.out.println("what is "+n1 + " + " +n2 + "= ?");
          int answer = input.nextInt();
          
          System.out.println(n1 + " + " +n2 + " = "+answer +(n1 + n2 == answer));
         

	}

}
