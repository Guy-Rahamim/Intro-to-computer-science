//Dalya Wiliam & Guy Rahamim
//Assignment9

import java.util.Scanner;
public class Exe9_DividingTheFloats
{
	
	public static void main(String[] args)
		{
			//initializing variables.
			Scanner input = new Scanner (System.in);
			double num1, num2, biggest, smallest;
	 
			//asking the user for input.
			System.out.println("Please enter 2 numbers: ");
			num1=input.nextDouble();
			num2=input.nextDouble();
			
			//finding the biggest and smallest number.
			biggest=num1>num2 ? num1:num2;
			smallest=num1<num2 ? num1:num2;
			
			//printing the remainder of the devision, and the quotient.
			System.out.println(biggest + " has a remainder of " + biggest%smallest + " when divided by " + smallest);
			System.out.println(biggest + "\\" + smallest + "=" + biggest/smallest );
		
			input.close();
		}
}
