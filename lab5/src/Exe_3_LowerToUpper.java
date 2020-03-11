import java.util.Scanner;
public class Exe_3_LowerToUpper
	{
		public static void main(String[] args)
			{
				//initializing variables.
				Scanner input = new Scanner(System.in);
				int upperBound, lowerBound, i;
				
				//taking user input.
				System.out.println("Please enter the upper bound: ");
				upperBound=input.nextInt();
				
				System.out.println("Please enter the lower bound: ");
				lowerBound=input.nextInt();
				
				//turning the lower bound into a negative number.
				lowerBound*=-1;
				
				//a for loop the runs from the negative lower bound
				//to the positive upper bound.
				for (i=lowerBound;i<=upperBound;i++ )
					{
						//if i is equal to the upper bound,
						//print i and a dot.
						if (i==(upperBound))
							System.out.print(i + ".");
						
						// else, print i with a comma.
						else 
							System.out.print(i + ", ");
					}
				input.close();
				
				
				
			/*	available also in while format.
				i=lowerBound;
				while (i<=upperBound)
					{
						System.out.println(i);
						i++
					}
					*/
			}
	}
