//Dalya Wiliam & Guy Rahamim
//Assignment8

import java.util.Scanner;
public class Exe8_TheBigTheSmallAndTheDifference 
{

	public static void main(String[] args) 
		{
			//initializing variables
			Scanner input=new Scanner(System.in);
			int num1, num2, num3, biggest, smallest;
			
			//take user input.
			System.out.println("Please enter a number: ");
			num1=input.nextInt();
			
			System.out.println("Please enter a second number: ");
			num2=input.nextInt();
			
			System.out.println("Please enter a third number: ");
			num3=input.nextInt();
			
			//finding the biggest number.
			biggest= num1>num2 && num1>num3 ? num1 : num2;
			biggest= biggest>num3 ? biggest : num3;
			
			//finding the smallest number.
			smallest = num1 < num2 && num1 < num3 ? num1 : num2;
			smallest = smallest < num3 ? smallest : num3;
			
			//printing the results.
			System.out.println("The biggest number is: " + biggest);
			System.out.println("The smallest number is: " + smallest);
			System.out.println("The difference is: " + (biggest-smallest));
			
			input.close();
	}
}
