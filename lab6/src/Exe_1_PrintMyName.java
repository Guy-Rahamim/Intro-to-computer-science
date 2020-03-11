import java.util.Scanner;
public class Exe_1_PrintMyName
	{
		public static Scanner input = new Scanner (System.in); 
		public static void main(String[] args)
			{
				double num1,num2, sum;
				System.out.println("Please enter the base: ");
				num1=input.nextDouble();
				
				System.out.println("Please enter the exponent: ");
				num2=input.nextDouble();
				
				sum=powerCalculator(num1,num2);
				System.out.println("The result is: "+ sum);
				
				System.out.println("Please enter num for sqrt");
				printSquereRoot();
			}

		
		public static double powerCalculator (double num1, double num2)
		{
			double sum;
			sum=Math.pow(num1, num2);
			return sum;
		}
		
		public static void printSquereRoot()
		{
			float num;
			System.out.println("Please enter a number: ");
			num=input.nextFloat();
			System.out.printf("squere root of %f is %.2f",num, Math.sqrt(num));

		}
		
		public static float max (float num1, float num2)
		{
			return num1;
		}
	}





















