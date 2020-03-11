import java.util.Scanner;
public class Exe_5_RectangularNumber
	{
		public static void main(String[] args)
			{
				//initializing variables.
				Scanner input = new Scanner(System.in);
				int num, i, j;
				
				//asking the user for input.
				System.out.println("Please enter a number: ");
				num=input.nextInt();
				
				//a for loop that runs from 0 to num-1,
				//iterating on i.
				//outer loop separates the lines.
				for (i=0; i<=num-1 ; i++)
					{
						//a for loop that runs from 0 to num-1,
						//iterating on j.
						//inner loop prints stars in line.
						for (j=0; j<=num-1 ; j++)
							{
								System.out.print(" * ");
							}
						System.out.println("");
					}
				input.close();
				
			}
	}
