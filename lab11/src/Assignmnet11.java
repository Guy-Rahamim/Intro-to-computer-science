import java.util.Arrays;

public class Assignmnet11
	{
		public static void main(String[] args)
			{
			//--------------------Exe.1	-------------------------------
//				System.out.println(recAscendingDigitsNum(1243567));
			
			//--------------------Exe,2------------------------------
				
				int[] array = {0,0,0,3};
		//		System.out.println(recSumMinMaxArr(array,0));
			System.out.println(recSumMinMaxArr(array));
			
//			//-------------------Exe.3 --------------------------------
//			System.out.println(recSumEvenDigits(25446770));
//			
//			//-------------------Exe.4 -------------------------------
//			char[] charArray= {'a','a','a','b','a','r','c','r','g','t','h','y'};
//			System.out.println(recCountCharsInArray(charArray, '0'));
//			
//			//------------------Exe.5 --------------------------------
//			
//			printHourGlass(5);
		
			
			}

		//------------------------Exe,1--------------------------------
		public static boolean recAscendingDigitsNum(int num)
		{
			boolean answer=true;
			if (num>0)
				{
					if (num%10 < (num/10)%10)
						{
					return false;
						}
					answer=recAscendingDigitsNum(num/10);
				}
			return answer;
		}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public static int recSumMinMaxArr(int[] array, int min, int max)
		{
			max=array[0];
			min=array[0];
			if (array.length>1)
				{					
			max =Math.max(max, array[0]);
			min= Math.min(min, array[0]);
			//return (recSumMinMaxArr(Arrays.copyOfRange(array, 1, array.length)));
				}

			
			return min+max;

			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		public static int recSumEvenDigits(int num)
		{
			int counter=0;
			return recSumEvenDigits(num, counter);
		}
		public static int recSumEvenDigits(int num,int counter)
		{
			if (num<=0)
				return counter;
			if ((num%10)%2==0)		
				counter+= num%10;
		return recSumEvenDigits(num/10,counter);
		}
		
		public static int recCountCharsInArray(char[]charArray, char character)
		{
			int index=0, counter=0;
			 return recCountCharsInArray(charArray, character, index, counter);
		}
		
		public static int recCountCharsInArray(char[] charArray, char character, int index, int counter)
		{
			if (index==charArray.length)
				{
					return counter;
				}
			if (character==charArray[index])
				counter++;
			return recCountCharsInArray(charArray, character, index+1, counter);
		}
		
		public static void printTriangle(int num)
		{
			if (num>1)
				printTriangle(num-1);
			for (int i=0; i<num;i++)
				{
					System.out.print("*");
				}
			System.out.println();
		}
		
		public static void printHourGlass(int num)
		{
			for (int i=num; i>0;i--)
				
					System.out.print("*");
				
			System.out.println();
			if (num>1)
				printHourGlass(num-1);
			
			for (int i=0;i<num;i++)
				System.out.print("*");
				System.out.println();
				return;
		}
			
				}	
			
		

	
