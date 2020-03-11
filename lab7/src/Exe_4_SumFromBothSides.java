import java.util.Scanner;
public class Exe_4_SumFromBothSides
	{
		public static void main(String[] args)
			{
				Scanner input = new Scanner (System.in);
				int [] array;
				int sumRight=0, sumLeft=0;
				System.out.println("Please enter the size of the array");
				array= new int [input.nextInt()];
				System.out.println("Please enter array values:");
				for (int i=0; i<array.length;i++)
					{
						array[i]=input.nextInt();
					}
				
				
				
				for (int i=array.length-1;i>=0;i--)
					{
						sumRight+=array[i];
						sumLeft+=array[array.length-1-i];
						System.out.println("sum right : " + sumRight + "  sum left: " + sumLeft);
						if (i==(array.length-i-1))
									{
										if (sumRight==sumLeft+array[array.length-i-1])
											System.out.println("GREAT AT " +i);
									}
					}
				input.close();
			}
	}
