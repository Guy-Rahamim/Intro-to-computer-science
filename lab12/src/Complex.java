

public class Complex
	{
		Complex ( double real1, double imaginary2)
		{
			real=real1;
			imaginary=imaginary2;
		}
		Complex()
		{
			real=0;
			imaginary=0;
		}
		double real;
		double imaginary;
		
		public String toString()
		{ 
			String re= real + " + " +imaginary + "i";
			return re;
		}
		
		
		public double complexSize()
		{
			return Math.sqrt(Math.pow(real, 2)+  Math.pow(imaginary, 2));
		}
	}
