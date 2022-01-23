package com.methods;

import java.util.Scanner;

public class Example5 {

		static int value1 = 20, value2 = 10, sum, sub, product, division, mode;

		public static void sum1()
		{		
			sum = value1+value2;
			System.out.println("Sum: "+sum);
		}

		public static void sub1()
		{		
			sub = value1-value2;
			System.out.println("Substruction: "+sub);
		}

		public static void product1()
		{		
			product = value1*value2;
			System.out.println("Product: "+product);
		}

		public static void division1()
		{		
			division = value1/value2;
			System.out.println("Division: "+division);
		}

		
		public static void mode1()
		{		
			mode = value1%value2;
			System.out.println("Mode: "+mode);
		}

		public static void main(String[] args)
		{
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Calculator Menu: \n");
			System.out.println("1.Sum");
			System.out.println("2.Substruction");
			System.out.println("3.Product");
			System.out.println("4.Division");
			System.out.println("5.Mode\n");
			
			
			System.out.println("Select your operation: ");
			int operator = scanner.nextInt();
			
			switch(operator)
			{
				case 1:
					sum1();
					break;
				
				case 2:
					sub1();
					break;
				
				case 3:
					product1();
					break;
					
				case 4:
					division1();
					break;
					
				case 5:
					mode1();
					break;
				
				default:
					System.out.println("select valid operation...!");
			}
			
			scanner.close();
			
		}
		

	}

