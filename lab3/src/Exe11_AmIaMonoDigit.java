import java.util.Scanner;
public class Exe11_AmIaMonoDigit
{
	public static void main(String[] args) 
		{
			
			//initializing variables.
			Scanner input= new Scanner(System.in);
			int userNum;
			final int monoDigitChecker=111;
			
			//taking user chosen 3 digit number.
			System.out.println("Please enter a 3-digit number: ");
			userNum=input.nextInt();
			
			//if the chosen number divided by 111 has no remainder, it is a mono digit number.
			if (userNum % monoDigitChecker == 0)
				System.out.println("EQUAL! :)");
			
			//if it has a remainder, it is not a mono digit number.
			if (userNum % monoDigitChecker != 0 )
				System.out.println("UNEQUAL! :(");
			input.close();
	}

}
