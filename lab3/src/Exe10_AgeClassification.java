import java.util.Scanner;

public class Exe10_AgeClassification
{
	
	public static void main(String[] args) 
		{
			//initializing variables.
			Scanner ageRecorder=new Scanner (System.in);
			int age, ageCode;
			
			//taking users age.
			System.out.println("Please enter your age: ");
			age=ageRecorder.nextInt();
			
			//checking the range the users age is in and assigning the appropriate age code.
			ageCode= 0<age && age<=3 ? 0:1;
			ageCode= 3<age && age <=12 ? 1:ageCode;
			ageCode= 12<age && age <=18 ? 2:ageCode;
			ageCode= 18<age && age <=65 ? 3:ageCode;
			ageCode= 65<age ? 4:ageCode;
			
			//printing the correct age code.
			System.out.println(ageCode);
			
			ageRecorder.close();
	}
}
