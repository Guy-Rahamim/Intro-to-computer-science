import java.util.Scanner;
public class Exe_1_
	{
		public static void main (String[] args)
		{
			Scanner input = new Scanner (System.in);
			int num, i, j ;
			System.out.println("Please enter a number representing a size of a chess board: ");
			num=input.nextInt();
			for (i=0; i<num;i++)
				{
					for (j=0;j<num;j++)
						{
							if (i%2==0)
								{
							if (j%2==0)
								{ 
									System.out.print(" X ");
								}
							else {
									System.out.print(" O ");
								 }
								}
							else
								{
									if (j%2==0)
										{ 
											System.out.print(" O ");
										}
									else {
											System.out.print(" X ");
										 }
								}
						}	

					System.out.println("");
				}
			input.close();
		}
	}
