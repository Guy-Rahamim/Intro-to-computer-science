//Dalya Wiliam & Guy Rahamim
//Assignment6

import java.util.Scanner;
public class Exe6_WhatIsMySign 
{
	public static void main(String[] args) 
		{
		
			//initializing variables
			Scanner input= new Scanner (System.in);
			int userChoice;
			System.out.println("Please enter a number: ");
			
			//taking user input.
			userChoice=input.nextInt();
			
			//checking whether the user number is positive, zero of negative
			//and prints accordingly.
			if (userChoice>0)
				System.out.println("The number is Positive!");
			
			if (userChoice==0)
				System.out.println("The number is Zero!");
			
			if (userChoice<0)
			System.out.println("The number is Negative!");
			
			input.close();
	}
}
