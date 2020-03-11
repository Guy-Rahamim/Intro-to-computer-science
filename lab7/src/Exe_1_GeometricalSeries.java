import java.util.Scanner;

public class Exe_1_GeometricalSeries
	{
		public static void main(String[] args)
			{
				//initializing variables.
				Scanner input = new Scanner (System.in);
				boolean notASeries=false;
				int i;	
				int[] geoArray;

				//a do while loop that checks the length of the array to check if it
				//can be a geometric series.
				do {
					//asking the user for the size of the series.
				System.out.println("Please choose the size of your series");
				geoArray = new int [(input.nextInt())];	
				
				//if the length is 0,1 or 2, print that its a bad input.
				if (geoArray.length==0 ||geoArray.length==1||geoArray.length==2)
					System.out.println("a series with 0, 1 or 2 in it is not a seris. its just numbers. try again!");
				}
				while (geoArray.length==0 ||geoArray.length==1 || geoArray.length==2);

				//a for loop the initializes array with user input.
				for (i=0;i<geoArray.length; i++)
					{
						System.out.println("please series member number " + (i+1));
						geoArray[i]=input.nextInt();
						//if the array has a 0 in it, it is defiantly 
						//not a series.
						if (geoArray[i]==0)
								notASeries=true;
						
					}
				for  (i=geoArray.length-2; i>0&& notASeries==false;i--)
					{
						//TODO enter condition for dealing with division by 0;
				if (geoArray[i+1]/geoArray[i] != geoArray[i]/geoArray[i-1])
					notASeries=true;
					
					}
				
				//if notASeries is true, print not a geometric series.
				if (notASeries)
					System.out.println("Not a geometrical series!");
				
				//else, print it is a geometric series.
				else
					System.out.println("a geometrical series!");
				
				input.close();
			}
	}
