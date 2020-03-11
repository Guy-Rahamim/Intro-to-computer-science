//Dalya Wiliam & Guy Rahamim
//Assignment 12
public class Runner
	{
		public static void main(String[] args)
			{
				
				//----------------------Question 1----------------------//
				System.out.println("Excercise 1:");
				Soldier nameless= new Soldier();
				nameless.printSoldierDetails();
				System.out.println("\n");
				
				Soldier abraham= new Soldier(275,78.7, 1.78, "Abraham");
				abraham.printSoldierDetails();
				System.out.println("\n");
				
				Soldier dupAbraham= new Soldier(abraham);
				dupAbraham.printSoldierDetails();
				System.out.println("\n");
				
				//-----------------------Question2---------------------//
				System.out.println("Excercise 2:");
				Supermarket megaMart= new Supermarket();
				megaMart.printSupermarketStatus();
				System.out.println("\n");
				
				
				Supermarket giantMart= new Supermarket("capeTown road", 23,50, 5700, 70000);
				giantMart.printSupermarketStatus();
				System.out.println("Is Giantmart efficient? the answer is " + giantMart.isEfficient());
				System.out.println("\n");
				
				
				Supermarket copyMart= new Supermarket(giantMart);
				copyMart.setAverageIncome(39999);
				copyMart.printSupermarketStatus();
				System.out.println("is Copymart efficient? the answer is " + copyMart.isEfficient());
				System.out.println("\n");
				
				//----------------------Question3----------------------//
				System.out.println("Excercise 3:");
				Television baseTV = new Television ();
				baseTV.printTVSpecs();
				System.out.println("\n");
				
				Television pricySmallTV= new Television("Apple", "Super mega premium ver. 1.0", 20, 27500);
				pricySmallTV.printTVSpecs();
				System.out.println("Is " +pricySmallTV.getModel()+" small and pricy? the answer is " +pricySmallTV.isExpensiveAndSmall());
				System.out.println("\n");
				
				Television betterTV = new Television (pricySmallTV);
				betterTV.setModel("Super mega premium ver 2.0");
				betterTV.setSize(40);
				betterTV.setPrice(4999);
				betterTV.printTVSpecs();
				System.out.println("is "+ betterTV.getModel()+ " small and pricy? the answer is " + betterTV.isExpensiveAndSmall());
				
				}
	}
