package array;
import java.util.Scanner;
public class ConsoleInput {

	public static void main(String[] args) {
	
Scanner input = new  Scanner(System.in);

int[] ara = new int[10];
int total = 0;
System.out.print("Enter my list " +ara.length + " values :");

for(int i = 0; i<ara.length;i++)
{
	ara[i] = input.nextInt();
}

for(int i = 0;i<ara.length;i++)
{
	System.out.print(ara[i]+" ");
	total = total + ara[i];
}

System.out.print("toatl = "+total);

//character type array input

System.out.println();
char[] city = {'D', 'a', 'l', 'l', 'a', 's'};
System.out.println(city);

	}

}
