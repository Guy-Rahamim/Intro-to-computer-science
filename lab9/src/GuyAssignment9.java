

public class GuyAssignment9
	{
		public static void main(String[] args)
			{
				
				//-------------------------------Question 1 ----------------------------//
				int[] array = {1,2,3,4,5,6,7,8};
				reverseArray(array);
				
				for (int i = 0; i < array.length; i++)
					{
						System.out.print(array[i] + "\t");
					}

				//-------------------------------Question 2 ----------------------------//
				System.out.println("\n\n\n");
				char[] charArray = {'t','T','%','%','%','@','!','0','a','O','P','@','&','@'};
				char chosenChar = '@';
				for (int i = 0; i < charArray.length; i++)
					{
						System.out.print(charArray[i] +"\t");
					}
				System.out.println("\nThe character " +chosenChar + " appeared " + countTheChar(charArray,chosenChar) + " times.");
				
				
				
				
				//-------------------------------Question 3 ---------------------------//
				int [][]toCheck = {{1,1,4,1},{2,2,2,2},{3,3,3,3},{6,6,6,6}};

				for (int i = 0; i < toCheck.length; i++)
					{
						for (int j = 0; j < toCheck.length; j++)
							{
								System.out.print(toCheck[i][j] +"\t");
							}
						System.out.println();
					}
				System.out.println("The answer is: " +lastRowEquivelent(toCheck));
				
				
				
				
				//------------------------------------	 Question 4 ----------------------//
				int[][] arrayToCheck = {{1,3,7}, {2,3,4}, {7,10,54}};
				ascendingArray(arrayToCheck);
				
				
				
				
				
				//------------------------------------Question 5 -------------------------//
				int[][] arr1 = {{4,7,-2,10},{8,8,2,3},{-7,1,40,9},{5,20,40,7}};
				int[][] arr2=arrayChanger(arr1);
				
				for (int i = 0; i < arr2.length; i++)
					{
						for (int j = 0; j < arr2.length; j++)
							{
								System.out.print(arr2[i][j] + "\t" );
							}
						System.out.println();
					}
				}
				

		
		
		public static void reverseArray (int[] array)
		{
			int temp;
			for (int i = 0, j=array.length-1; i < (array.length)/2; i++, j--)
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;				
				}

		}
		
		public static void reverseArray2 (int[] array)
		{
			int temp;
			for (int i = 0; i < array.length; i++)
				{
					temp=array[i];
					array[i]=array[array.length-1-i];
					array[array.length-1-i]=temp;
				}
		}
		
		public static int countTheChar (char[] array, char chosenChar)
		{
			int counter=0;
			for (int i = 0; i < array.length; i++)
				{
					if (array[i]==chosenChar)
						counter++;
				}
			return counter;
		}
		
		public static boolean lastRowEquivelent (int[][] array)
		{
	
			for (int i = 0; i < array.length; i++)
				{
					int colSum=0;
					for (int j = 0; j < array[i].length; j++)
						{	
						if (j!=array[i].length-1)
							{
								colSum+=array[j][i];
							}
						else
							{
								if (colSum!=array[j][i])
									{

										return false;
									}		
							}
						}
				}
			return true;
		
		}
		
		public static void ascendingArray (int[][] array)
		{
			boolean answer=true;
			for (int i = 0; i < array.length; i++)
				{
					for (int j = 0; j < array.length-1; j++)
						{
							if (array[i][j]>=array[i][j+1])
							answer=false;	
						}
				}
			System.out.println("is the array ascending all the way? the answer is " + answer);

		}
		
		public static int[][] arrayChanger (int[][] arr1)
		{
			int[][] arr2= new int [arr1.length][arr1[0].length];
			for (int i = 0; i < arr2.length; i++)
				{
					for (int j = 0; j < arr2[i].length; j++)
						{
							arr2[i][j]=arr1[arr1.length-1-i][i];
						}
				}
			return arr2;
		}
		
	}
