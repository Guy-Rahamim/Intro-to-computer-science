
public class lab13
	{
		public static void main(String[] args)
			{
				int [] array= {-5,7,70,22,3,13};
				System.out.println(limitArray(array,array.length-1,10));
				for (int i = 0; i < array.length; i++)
					{
						System.out.print(array[i]+"\t");
					}
				
			}
		
		public static int decToBin(int num)
		{
			if (num/2==0)
				return 1;
			
			if (num%2==1)
				return 10*decToBin(num/2)+1;
			return 10*decToBin(num/2);
		}
		
		public static boolean compare (int x, int y)
		{
			if (y!=0 && y>10)
				{
					int temp=y%10;
					return compare(x,y/10+temp);
				}
			if (x!=0 && x>10)
				{
					int temp = x%10;
					return compare (x/10+temp,y);
				}
			if (x==y)
				return true;
			return false;
				}
		
		
		public static int  limitArray(int[] array, int size, int limit)
		{
			int counter=0;
			for (int i = 0; i < array.length; i++)
				{
					if (array[i]>limit)
						array[i]=-1;
				}
			for (int i = 0; i < array.length; i++)
				{
					
				}
			
			
			return counter;
		}
		}
	
