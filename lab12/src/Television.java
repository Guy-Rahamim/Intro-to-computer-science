//Dalya Wiliam & Guy Rahamim
//Assignment 12
public class Television
	{
		private String company;
		private String model;
		private int size;
		private int price;

		// default constructor
		public Television()
			{
				setCompany("CompanyA");
				setModel("model A");
				setSize(0);
				setPrice(0);
			}

		// parametric constructor
		public Television(String company, String model, int size, int price)
			{
				setCompany(company);
				setModel(model);
				setSize(size);
				setPrice(price);
			}

		// duplication constructor
		public Television(Television other)
			{
				setCompany(other.company);
				setModel(other.model);
				setSize(other.size);
				setPrice(other.price);
			}

		public String getCompany()
			{
				return company;
			}

		
		public String getModel()
			{
				return model;
			}

		
		public int getSize()
			{
				return size;
			}

		
		public int getPrice()
			{
				return price;
			}

		
		public void setCompany(String company)
			{
				this.company = company;
			}

		
		public void setModel(String model)
			{
				this.model = model;
			}

		public void setSize(int size)
			{
				if (size < 0)
					{
						System.out.println("bad size for tv model" + getModel());
						this.size = 0;
					}

				else
					this.size = size;
			}

		public void setPrice(int price)
			{
				if (price < 0)
					{
						System.out.println("bad price for tv model" + getModel());
						this.price = 0;
					}

				else
					this.price = price;
			}

		// function checks if TV is small and expensive
		// and returns true if it is
		public boolean isExpensiveAndSmall()
			{
				if (price > 5000 && size < 21)
					return true;
				return false;
			}

		// function that prints the specifications of a television
		public void printTVSpecs()
			{
				System.out.println("Company: " + getCompany() + "\n" + "Model: " + getModel() + "\n" + "Size: "
						+ getSize() + "\n" + "Price: " + getPrice());
			}
	}
