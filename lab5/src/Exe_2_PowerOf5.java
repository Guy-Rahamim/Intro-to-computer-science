import java.util.Scanner;
public class Exe_2_PowerOf5
	{
		
		public static void main(String[] args)
			{
				//initializing variables.
				Scanner input = new Scanner(System.in);
				int num, result=1, i, targetPower=5;
				
				//taking user input
				System.out.println("Please enter a number: ");
				num=input.nextInt();
				
				//calculating power of num to the target power.
				for (i=1;i<=targetPower;i++)
					{
						result*=num;
					}
				
				//print the result
				System.out.println(result);
				
				input.close();
				
			}
		
	}
