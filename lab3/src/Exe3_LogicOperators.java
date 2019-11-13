//Dalya Wiliam & Guy Rahamim
//Assignment3
import java.util.Scanner;

public class Exe3_LogicOperators
{
	public static void main(String[] args)
	{
		//initializing variables.
		Scanner input=new Scanner (System.in);
		int x, y;
		
		//taking user input.
		System.out.print("Please enter a number for the variable x: ");
		x=input.nextInt();
		System.out.print("\nPlease enter a number for the variable y: ");
		y=input.nextInt();
		
		//decide if the following statements are true or false and print the result
		System.out.println("y<10 && x<10 is " + (y<10 && (x<10)));
		System.out.println("y<10 || x<10 is " + (y<10||(x<10)));
		
		input.close();
	}

}
	
	
	
