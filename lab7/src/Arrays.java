import java.util.Scanner;
public class Arrays
	{
		public static void main(String[] args)
			{
			Scanner input = new Scanner (System.in);
			int num;
			num = input.nextInt();	
			int[] array = new int [num];
			
			for (int i=0;i<array.length;i++)
				{
					System.out.println("Please a number for the "+i + " place of the array");
					array[i]=input.nextInt();
				}
			System.out.print("The array is : ");
			for (int i=0; i<array.length;i++)
				{
					System.out.print(" "+array[i]);
				}
			input.close();
			}
	}
