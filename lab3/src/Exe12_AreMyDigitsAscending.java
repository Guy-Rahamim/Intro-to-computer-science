import java.util.Scanner;
public class Exe12_AreMyDigitsAscending 
{
		public static void main(String[] args) 
			{
				//initializing variables.
				Scanner input=new Scanner(System.in);
				int numToCheck, hundredsDivisor=100, tensDivisor=10, onesDivisor=1;
				int firstDigit, secondDigit, thirdDigit;
				
				//take a number from the user.
				System.out.println("please enter a 3 digit number: ");
				numToCheck=input.nextInt();
				
				//isolate each digit and store it in a variable.
				firstDigit=numToCheck/hundredsDivisor;
				secondDigit=numToCheck/tensDivisor;
				secondDigit=secondDigit%tensDivisor;
				thirdDigit=(numToCheck%hundredsDivisor)%tensDivisor;
				
				//check if the digits are in an ascending order and print
				if (firstDigit+1 == secondDigit && secondDigit+1 == thirdDigit )
					System.out.println("The digits of your number are ascending! :)");
				
				//check if the digits are not in an ascending order and print.
				if (firstDigit+1 != secondDigit || secondDigit+1 != thirdDigit)
					System.out.println("The digits of your number are not ascending! :(");
	
				input.close();
		}
}
