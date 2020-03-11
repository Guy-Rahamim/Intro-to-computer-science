import java.util.Scanner;

public class Exe_2_IsItAPalindrom
	{
		public static void main(String[] args)
			{
				//initializing variables
				Scanner input = new Scanner(System.in);
				boolean palindrom=true;
				
				//asking the user how long his number is
				System.out.println("please enter how many digits your number has: ");
				int[] array = new int [input.nextInt()];
				
				//a for loop that initializes the array with user input
				for (int i=0 ; i<array.length; i++)
					{
						System.out.println("Please enter digit number " +i);
						array[i]=input.nextInt();
					}
				
				//a for loop that checks if each number from the first
				//half of the number is the same as the corresponding 
				//number the second half of the number.
				for (int i=0; i<array.length&&palindrom==true; i++)
					{
						//if the numbers are different, set palindrom to false
						if (array[i]!=array[array.length-(i+1)])
							palindrom=false;
					}
				//if palindrom is true, print that the number is a palindrom!
				if (palindrom)
					System.out.println("The number you entered is a palindrom!");
				
				//else, print it is not.
				else 
					System.out.println("The number you entered is not a palindrom :(");
				input.close();
			}
	}
