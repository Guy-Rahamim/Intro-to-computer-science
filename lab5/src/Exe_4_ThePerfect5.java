import java.util.Scanner;
public class Exe_4_ThePerfect5
	{
		public static void main(String[] args)
			{
				//initializing variables
				Scanner input = new Scanner(System.in);
				int i, limitAndDivisor=5, num;
				boolean flag=true;
			
				
				System.out.println("Can you score a perfect 5?");
				
				//for loop that counts from one to 5.
				for (i=0 ; i<=limitAndDivisor-1 && flag ; i++)
					{
						//asks the user for a number.
						System.out.println("Please enter number: ");
						num=input.nextInt();
						
						//if the number % 5 == 1, print bad value
						//break the loop, and set flag to false.
						if (num % limitAndDivisor==1)
							{
								flag=false;
							}
					}
				
				//if flag is true, print perfect 5.
				if (flag)
					System.out.println("Perfect 5!");
				
				//else, print lose message
				else
					System.out.println("Maybe next time!");
				input.close();
			}
	}
