//Dalya Wiliam & Guy Rahamim
//Assignment12

import java.util.Scanner;
public class Exe12_AreMyDigitsAscending 
{
	public static void main(String[] args) 
	{
				//initializing variables.
		Scanner input=new Scanner(System.in);
		int numToCheck, hundredsDivisor=100, tensDivisor=10;
		int digit1, digit2, digit3;
		
		//take a number from the user.
		System.out.println("please enter a 3 digit number: ");
		numToCheck=input.nextInt();
		
		//find digit1 by dividing by 100 and ignoring the remainder.
		digit1=numToCheck/hundredsDivisor;
		
		//find digit2 by dividing by 10 and ignoring the remainder,
		//and then divide by 10 again and only keeping the remainder.
		digit2=(numToCheck/tensDivisor)%tensDivisor;
		
		//find digit3 by dividing by 10 and only keeping the remainder.
		digit3=(numToCheck%tensDivisor);
		
		//checks if each digit is bigger the the previous by 1.
		if ((digit1+1 == digit2) && (digit2+1 == digit3 ))
			System.out.println("The digits of your number are ascending! :)");
		
		//if at least one of the digits is not bigger than the
		//previous by 1, it is not an ascending number.
		if (digit1+1 != digit2 || digit2+1 != digit3)
			System.out.println("The digits of your number are not ascending! :(");

		input.close();
	}
}
