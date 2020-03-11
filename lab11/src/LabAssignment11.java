

public class LabAssignment11
	{
		public static void main(String[] args)
			{
				
				recDrawTriangle(5);
				
				
				int[] array= {1,2,3,4,5,6,7,8};
				recReverseArray(array);
				
				for(int i=0; i<array.length;i++)
					{
						System.out.print(array[i] + "\t");
					}
				
			}
		
		
		
		//----------Question 1
		public static void recDrawTriangle (int num)
		{
			if (num!=0)
				{
					for (int i=0; i<num; i++)
						{
							System.out.print("*");
						}
					System.out.println();
					recDrawTriangle(num-1);
				}
		}
		
		public static void recReverseArray ( int [] array)
		{
			int index=0;
			recReverseArray(array, index);
			
		}

		
		public static void recReverseArray (int[] array, int index)
		{
			if (index<array.length/2)
				{
					int temp = array[index];
					array[index]=array[array.length-1-index];
					array[array.length-1-index]=temp;
					recReverseArray(array, index+1);
				}	
		}
		

		}
	
