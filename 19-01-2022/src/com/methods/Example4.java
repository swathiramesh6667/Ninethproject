package com.methods;

public class Example4 {


		static int value1 = 20, value2 = 10, sum, sub, product, division, mode;

		//sum
		public static void sum1()
		{		
			sum = value1+value2;
			System.out.println("Sum: "+sum);
		}

		//sub
		public static void sub1()
		{		
			sub = value1-value2;
			System.out.println("Substruction: "+sub);
		}

		//product
		public static void product1()
		{		
			product = value1*value2;
			System.out.println("Product: "+product);
		}

		//division
		public static void division1()
		{		
			division = value1/value2;
			System.out.println("Division: "+division);
		}

		//mode
		public static void mode1()
		{		
			mode = value1%value2;
			System.out.println("Mode: "+mode);
		}

		//main method
		public static void main(String[] args)
		{
			mode1();
			sum1();
		}

}

