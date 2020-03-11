//Dalya Wiliam & Guy Rahamim
//Assignment 12
public class Supermarket
	{
		String address = "SupermarketA";
		private int numberOfRegisters;
		private int numberOfEmployees;
		private int numberOfProducts;
		private double averageIncome;

		//default constructor
		public Supermarket()
			{
				numberOfRegisters = 0;
				numberOfEmployees = 0;
				numberOfProducts = 0;
				averageIncome = 0;
			}

		//parametric constructor
		public Supermarket(String address, int numberOfRegisters, int numberOfEmployees, int numberOfProducts,
				double averageIncome)
			{
				setAddress(address);
				setNumberOfRegisters(numberOfRegisters);
				setNumberOfEmployees(numberOfEmployees);
				setNumberOfProducts(numberOfProducts);
				setAverageIncome(averageIncome);
			}

		//duplication constructor
		public Supermarket(Supermarket other)
			{
				setAddress(other.address);
				setNumberOfRegisters(other.numberOfRegisters);
				setNumberOfEmployees(other.numberOfEmployees);
				setNumberOfProducts(other.numberOfProducts);
				setAverageIncome(other.averageIncome);
			}

		
		public String getAddress()
			{
				return address;
			}
				
		
		public int getNumberOfRegisters()
			{
				return numberOfRegisters;
			}
	
		public int getNumberOfEmployees()
			{
				return numberOfEmployees;
			}
		
				
		public int getNumberOfProducts()
			{
				return numberOfProducts;
			}
				
		public double getAverageIncome()
			{
				return averageIncome;
			}

		
		public void setAddress(String address)
			{
				this.address = address;
			}

		
		public void setNumberOfRegisters(int numberOfRegisters)
			{
				if (numberOfRegisters < 0)
					{
						System.out.println("Bad number of registers for supermarket " + getAddress());
						this.numberOfRegisters = 0;
					} else
					this.numberOfRegisters = numberOfRegisters;
			}

		
		public void setNumberOfEmployees(int numberOfEmployees)
			{
				if (numberOfEmployees < 0)
					{
						System.out.println("Bad number of employees for supermarket " + getAddress());
						this.numberOfEmployees = 0;
					} else
					this.numberOfEmployees = numberOfEmployees;
			}

		
		public void setNumberOfProducts(int numberOfProducts)
			{
				if (numberOfProducts < 0)
					{
						System.out.println("Bad number of producets for supermarket" + getAddress());
						this.numberOfProducts = 0;
					} else
					this.numberOfProducts = numberOfProducts;
			}

		

		
		public void setAverageIncome(double averageIncome)
			{
				if (averageIncome < 0)
					{
						System.out.println("Bad average income! for supermarket " +getAddress());
						this.numberOfRegisters = 0;
					}
				this.averageIncome = averageIncome;
			}

		// custom class methods
		public boolean isEfficient()
			{
				if (numberOfProducts == 0 || numberOfEmployees == 0 || numberOfRegisters == 0)
					return false;

				if (numberOfEmployees / numberOfRegisters > 3 || numberOfProducts / numberOfEmployees < 50 || averageIncome < 40000)
					return false;
				return true;
			}

		public void printSupermarketStatus()
			{
				System.out
						.println("Supermarket address: " + address + "\n" + "number of employees: " + numberOfEmployees
								+ "\n" + "number of registers: " + numberOfRegisters + "\n" + "number of products: "
								+ numberOfProducts + "\n" + "current monthly average income: " + averageIncome);
			}

	}
