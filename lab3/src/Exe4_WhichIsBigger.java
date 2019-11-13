//Dalya Wiliam & Guy Rahamim
//Assignment4

import java.util.Scanner;
public class Exe4_WhichIsBigger
{

	public static void main(String[] args)
		{
			//initializing variables.
			Scanner input=new Scanner (System.in);
			int num1, num2, max;
			
			//taking input from the user.
			System.out.println("Please enter the first number:");
			num1=input.nextInt();
		
			System.out.println("Please enter the second number:");
			num2=input.nextInt();
		
			//comparing num1 and num2, storing the biggest and printing the result.
			max = num1>num2 ? num1:num2;
			System.out.println("The bigger number is: " + max);
		
			input.close();
		
	}
}
