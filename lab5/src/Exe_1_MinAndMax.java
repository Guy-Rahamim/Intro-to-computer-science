import java.util.Scanner;
public class Exe_1_MinAndMax
	{
		public static void main(String[] args)
			{
				//initializing variables.
				Scanner input = new Scanner(System.in);
				int num1, num2, num3, min, max;
				
				//receiving user input.
				System.out.println("Please enter the first number: ");
				num1=input.nextInt();
				
				System.out.println("Please enter the second number: ");
				num2=input.nextInt();
				
				System.out.println("Please enter the third number: ");
				num3=input.nextInt();
				
				//calculating the biggest number using Math.max function
				max=Math.max(Math.max(num1, num2), num3);
				
				//calculating the smallest number using Math.min function
				min=Math.min(Math.max(num1, num2), num3);
				
				//print out the biggest and smallest numbers.
				System.out.println("The biggest number is: " + max+ " and the smallest number is: " + min);
				
				input.close();
			}

	}
