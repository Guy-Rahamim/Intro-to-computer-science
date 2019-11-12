import java.util.Scanner;
public class Exe5_RangeFinder
{

	public static void main(String[] args)
		{
			//initializing variables
			Scanner input= new Scanner(System.in);
			final int lowerBoundary=12, upperBoundary=18, userChoice;
			
			//taking in user input.
			System.out.println("Please enter a number: ");
			userChoice=input.nextInt();
			
			//check if the user number is between the lower and upper boundaries.
			if (lowerBoundary<=userChoice && userChoice<=upperBoundary)
				System.out.println("It's in range! :)");
		
			//This program is useless without the following print command:
			System.out.println("Hasta la Vista, baby");
			input.close();
	}
}
