import java.util.Scanner;
public class Exe_7_TheGuessingGameV2
	{
		public static void main(String[] args)
			{
				//initializing variables.
				Scanner input = new Scanner (System.in);
				double num;
				int targetNumber, guess, i, maximumTries=10;
				boolean succeeded=false; //a boolean that stores whether the user succeeded.
				
				//assigning a random number to number, multiplying it by 100
				//and casting the result into targetNumber
				num=Math.random();
				targetNumber= (int) (num*100);
				
				
				
				System.out.println("Can you guess what number i'm thinking of?");
				
				//a for loop the runs from 0 the the maximum number of tries.
				//as long as the user hadn't succeeded yet.
				for (i=0;i<maximumTries && succeeded==false;i++)
					{
						//prints the number of tries remaining and asks for a guess.
						System.out.println("Number of tries remaining: " +( maximumTries-i));
						System.out.print("enter a guess between 1-100:\n\n");
						guess=input.nextInt();
						
						//if the user guessed right, set succeeded to true
						if (guess==targetNumber)
							{
								succeeded=true;
							}
						
						//if the guess is smaller the the target number,
						//tell the user the guess is too big.
						else if (guess > targetNumber)
							{
								System.out.println("Your guess is bigger than my number.\n");	
							}
							// if guess is smaller the target number,
							//tell the user the guess is to small 
						else if (guess < targetNumber )
							{
							    System.out.println("Your guess is smaller than my number.\n ");
							}
					}
				
				//if succeeded is true, print win statement
				if (succeeded)
					System.out.println("You did it!");
				
				//else, print lose statement.
				else
					System.out.println("Better luck next time :(");
				
				input.close();
			}
	}
