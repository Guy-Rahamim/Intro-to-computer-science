import java.util.Scanner;

public class Exe_3_PushToTheRight
	{
		public static void main(String[] args)
			{
				Scanner input = new Scanner (System.in);
				//int temp;
				
				System.out.println("Please enter the size or the array: ");
				int[] array = new int [input.nextInt()];
				
				for (int i=0;i<array.length;i++)
					{
						//System.out.println("Please enter array member number " +(i+1));
						array[i]=input.nextInt();
					}
				
				System.out.println("Original array :");
				for (int i=0 ; i<array.length;i++)
					{
						System.out.print(array[i] + " ");
					}
				
				int a, b;
				a=array[0];
				b=array[1];
				System.out.println("");
				for (int i=0; i<array.length;i++)
					{
						if ((i+1)>=array.length)
						array[0]=array[i];
						else
							{
								b=array[i+1];
								array[i+1]=a;
								a=b;
								
							}

					}
				System.out.println("Shifted array: ");
				for (int i=0; i<array.length;i++)
					{
						System.out.print(array[i] + " ");
					}
				input.close();
			}
	}
