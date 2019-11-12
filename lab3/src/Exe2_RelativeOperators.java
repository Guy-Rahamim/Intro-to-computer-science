
import java.util.Scanner;
public class Exe2_RelativeOperators
{
	public static void main(String[] args)
	{
		//initializing variables.
		Scanner input= new Scanner (System.in);
		int x, y;
		
		//taking in user input.
		System.out.println("Please enter a number for the variable x: ");
		x=input.nextInt();
		System.out.println("Please enter a numver for the variable y: ");
		y=input.nextInt();
		
		//printing comparison statements between x and y.
		System.out.println(" x < y is " + (x<y));
		System.out.println(" x > y is " + (x>y));
		System.out.println(" x <= y is " + (x<=y));
		System.out.println(" x >= y is " + (x>=y));
		System.out.println(" x == y is " + (x==y));
		System.out.println(" x != y is " + (x<y));
		
		input.close();
	}
}
