//Dalya Wiliam & Guy Rahamim
//Assignment 12
public class Soldier
	{
		private int pid;
		private double height;
		private double weight;
		private String name;
		
		
		//default constructor
		public Soldier()
			{
				setPid(123);
				setHeight(0);
				setWeight(0);
				setName("nameless soldier");
			}

		//parametric constructor
		public Soldier(int pid, double height, double weight, String name)
		{
			setPid(pid);
			setHeight(height);
			setWeight(weight);
			setName(name);
		}
		
		//copy constructor
		public Soldier( Soldier other)
		{
			setPid(other.pid);
			setHeight(other.height);
			setWeight(other.weight);
			setName(other.name);
		}

		public int getPid()
			{
				return pid;
			}

		public void setPid(int pid)
			{
				if (pid<0)
					{
						System.out.println("invalid pid!");
						this.pid=0;
					}
				this.pid = pid;
			}

		public double getHeight()
			{
				return height;
			}

		public void setHeight(double height)
			{
				if (height<0)
					{
						System.out.println("invalid height for soldier with pid number " + getPid()+" resetting to 0.");
						this.height=0;
					}
				this.height = height;
			}

		public double getWeight()
			{
				return weight;
			}

		public void setWeight(double weight)
			{
				if (weight<0)
					{
						System.out.println("invalid weight for soldier with pid number "+ getPid()+ " resetting to 0.");
						this.weight=0;
					}
				this.weight = weight;
			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public void printSoldierDetails()
		{
			System.out.println("name: "+ name+"\n "
					+" pid: " + pid +"\n"
					+ " height: " + height +"\n"
					+ " weight: " + weight);
		}
	}
