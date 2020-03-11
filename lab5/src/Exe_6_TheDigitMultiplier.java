import java.util.Scanner;
public class Exe_6_TheDigitMultiplier
	{
		public static void main(String[] args)
			{
				//initializing variables.
				Scanner input= new Scanner (System.in);
				int num, tempNum, digitMul=1;
				
				//asking the user for input.
				System.out.println("Please enter a number");
				num = input.nextInt();
				
				//using a temporary variable tempNum so the
				//original value of num won't be overwritten
				tempNum=num;
				
				//if number is negative, turn it into a positive.
				if (tempNum < 0)
					tempNum*=-1;
				
				//if the number is bigger than 0, enter the loop
				if (tempNum!=0)
							{
								 while (tempNum>0)
									 {
										 //multiply digitMul by the last digit of the number
										 //then eliminates said digit.
										 digitMul*=(tempNum%10);
										 tempNum/=10; 				
									 }
							}
								 else {digitMul=0;}

				 
				 //print the result
				 System.out.println(digitMul);
				
				 
				 input.close();
			}
	}
