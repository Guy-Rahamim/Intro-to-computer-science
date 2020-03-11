package lab8;

public class Lab8Exes
	{
		public static void main(String[] args)
			{
				
				/*
				EXE1
				[] array = {1,2,3,4,5};
				System.out.println(arraySum(array));
				*/
				
				/*Exe2
			     int[][] arr1 = {{1,3,2},{5,6,7},{4,1,2}}; 
			     int[][] arr2 =  new int [arr1.length][arr1.length];
			     for (int i=0; i<arr1.length;i++)
			    	 {
			    		 for (int j=0; j<arr1[i].length;j++)
			    			 {
			    				 arr2[i][j]=arr1[i][j];
			    				 System.out.print(arr2[i][j] + " ");
			    			 }
			    		 System.out.println("");
			    		  }
			    		 */
				/*EXE3
				int [][] array= {{1,5,590}, {95},{50,2,2}};
				System.out.println(array2DMax(array));
			    	*/
				
				
				/*EXE4
				int[][] array = {{5,5,2}, {10,3,4}};
				System.out.println(array2DMult(array));
				*/
				
				int[][] array = {{1,2,3},{0,5,7},{0,4,6,7,8,90}};
				checkAscendingArray(array);
			     

			}
		
		
		public static int arraySum(int[] array)
		{
			int sum=0;
			for (int i=0;i<array.length;i++)
				{
					sum+=array[i];
				}
			return sum;
		}
		
		//Exe.3
		public static int array2DMax(int[][] array)
		{
			int max=array[0][0];
			for (int i=0;i<array.length;i++)
				{
					for (int j=0;j<array[i].length;j++)
						{
							max=max>array[i][j]?max:array[i][j];
						}
				}
			return max;
		}
		//Exe.4
		public static int array2DMult(int[][] array)
		{
			int mult=1;
			for (int i=0; i<array.length;i++)
				{
					for 
						(int j=0; j<array[i].length;j++)
						{
							mult*=array[i][j];
						}
				}
			return mult;
		}
		
			//Exe.5
			public static void checkAscendingArray(int [][] array)
			{
			boolean ascending = true;
			for (int i= 0; i<array.length; i++)
				{
					for (int j=0; j<(array[i].length-1) && (ascending==true) ;j++)
						{
						if (array[i][j+1]<=array[i][j])
							ascending=false;
						}
				}
			if (ascending)
				System.out.println("The array is ascending!");
			else
				System.out.println("The array is not asencing! :(");
			}
	}
	
