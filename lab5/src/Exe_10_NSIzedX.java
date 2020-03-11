
import java.util.Scanner;
public class Exe_10_NSIzedX
	{
		public static void main(String[] args)
			{
				//initializing variables.
				Scanner input = new Scanner(System.in);
				int num, i, j;
				
				//ask the user for input.
				System.out.println("please enter a while odd number between 2 to 20:");
				num= input.nextInt();
				
				//if the number is even or not between 2 and 20,
				//reassign num to 5.
				if (num%2==0 ||( num< 2 || num > 20))
							{
								System.out.println("Bad input! \nConverting your number to 5. \n");
								num=5;
							}
				
				//for loop that runs num-1 times,
				//iterating on i.
				for (i=0 ; i<=num-1 ; i++)
					{
						//for loop that runs num-1 times,
						//iterating on j.
						//inner loop prints X's or spaces in line.
						for (j=0; j<=num-1; j++)
							{
								//if these conditions are met, print an X.
								if ((j==i || j+i==(num-1)))
									{	
										System.out.print("X");		
									}
								//else, print a space.
								else System.out.print(" ");				
							}
						System.out.println("");
				}
				input.close();
		}
}