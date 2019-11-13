//Dalya Wiliam & Guy Rahamim
//Assignment10

import java.util.Scanner;
public class Exe10_AgeClassification
{
	public static void main(String[] args) 
	{
		//initializing variables.
		Scanner ageRecorder=new Scanner (System.in);
		int age, ageCode=0;
		
		//each limit variable refers to the upper limit of an age range.
		int infantLim=3, childLim=12, youngsterLim=18, adultLim=65;
		
		//taking users age.
		System.out.println("Please enter your age: ");
		age=ageRecorder.nextInt();
		
		// if age is between 2 certain age limits, store the appropriate age code.
		//if not, don't change current age code.
		
		ageCode = age <=infantLim ? 0 : ageCode;
		ageCode = age > infantLim && age <= childLim ? 1 : ageCode;
		ageCode = age > childLim && age <= youngsterLim ? 2 : ageCode;
		ageCode = age > youngsterLim && age <= adultLim ? 3 : ageCode;
		ageCode = age > adultLim ? 4 : ageCode;
		
		//printing the correct age code.
		System.out.println(ageCode);
			
		ageRecorder.close();
	}
}