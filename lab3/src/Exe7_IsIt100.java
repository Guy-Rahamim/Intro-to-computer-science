//Dalya Wiliam & Guy Rahamim
//Assignment7

import java.util.Scanner;
public class Exe7_IsIt100
{
	public static void main(String[] args)
	{
		//initializing variables.
		Scanner input= new Scanner(System.in);
		int num1, num2, answer; 
		
		//asking the user for input.
		System.out.println("Please enter the first number: ");
		num1=input.nextInt();
		System.out.println("Please enter the second number: ");
		num2=input.nextInt();
		
		//checks if the sum is bigger than 100.
		//if it is, keep sum. if not, keep difference of sum from 100.
		//print result.
		answer= (num1+num2)>100 ? (num1+num2) : 100-(num1+num2);
		System.out.println(answer);
	
		input.close();
	}
}
