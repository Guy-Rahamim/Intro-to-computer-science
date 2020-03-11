import java.util.Scanner;
public class Exe_9_Asterix
	{
		public static void main(String[] args)
			{
				//initializing variables.
				Scanner input = new Scanner (System.in);
				int num, i, j;
				
				//ask the user for a number between 2 and 20.
				System.out.println("Please enter a number between 2 and 20");
				num= input.nextInt();
				
				//if the number is not in requested range,
				//change its value to 5.
				if (num<2 || num >20)
					{
						System.out.println("Bad input!\nchanging your selection to 5. \n");
						num=5;
					}
				
				//a for loop that runs from 0 to num-1,
				//iterating on i.
				//outer loop separates the lines.
				for (i=0; i<=num-1 ; i++)
				{
					//a for loop that runs from 0 to num-1,
					//iterating on j.
					//inner loop prints stars and spaces in line.
					for (j=0 ; j<num ; j++)
						{
							//if these conditions are met, print a star.
							if (j==(num-num) || j==num-1|| i==0 || i==num-1)
								
								{
									System.out.print("*");
								}
							//else, print a space.
							else
								{
									System.out.print(" ");
								}
						}
					System.out.println("");
				}
			input.close();
			}
	}
