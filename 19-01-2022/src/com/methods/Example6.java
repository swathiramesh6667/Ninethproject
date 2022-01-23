package com.methods;

import java.util.Scanner;

/**
 * Write a java program for calculator(sum, sub, product, division and mode).
 * using methods, Scanner class, switch-case and while loop.
 */

public class Example6 {

		static int value1, value2, sum, sub, product, division, mode;
		
		static Scanner scanner = new Scanner(System.in);

		public static void sum1()
		{	

			

			System.out.println("Enter First Value: ");
			value1 = scanner.nextInt();

			System.out.println("Enter Second Value: ");
			value2 = scanner.nextInt();

			sum = value1+value2;
			System.out.println("Sum: "+sum);

		}

		public static void sub1()
		{		


			System.out.println("Enter First Value: ");
			value1 = scanner.nextInt();

			System.out.println("Enter Second Value: ");
			value2 = scanner.nextInt();

			sub = value1-value2;
			System.out.println("Substruction: "+sub);

		}

		public static void product1()
		{		

			System.out.println("Enter First Value: ");
			value1 = scanner.nextInt();

			System.out.println("Enter Second Value: ");
			value2 = scanner.nextInt();

			product = value1*value2;
			System.out.println("Product: "+product);

		}

		public static void division1()
		{		

			System.out.println("Enter First Value: ");
			value1 = scanner.nextInt();

			System.out.println("Enter Second Value: ");
			value2 = scanner.nextInt();

			division = value1/value2;
			System.out.println("Division: "+division);


		}

		public static void mode1()
		{		
			

			System.out.println("Enter First Value: ");
			value1 = scanner.nextInt();

			System.out.println("Enter Second Value: ");
			value2 = scanner.nextInt();
			
			mode = value1%value2;
			System.out.println("Mode: "+mode);
			
			
		}

		public static void main(String[] args)
		{
			

			while(true)
			{
				System.out.println("Calculator Menu: \n");
				System.out.println("1.Sum");
				System.out.println("2.Substruction");
				System.out.println("3.Product");
				System.out.println("4.Division");
				System.out.println("5.Mode");
				System.out.println("6.Stop\n");

				
				System.out.println("Select your operation: ");
				int operator = scanner.nextInt();

				switch(operator)
				{
				case 1:
					sum1();
					System.out.println("---------------------------");
					break;

				case 2:
					sub1();
					System.out.println("---------------------------");
					break;

				case 3:
					product1();
					System.out.println("---------------------------");
					break;

				case 4:
					division1();
					System.out.println("---------------------------");
					break;

				case 5:
					mode1();
					System.out.println("---------------------------");
					break;
				
				case 6:
					System.exit(0);
					System.out.println("---------------------------");
					break;

				default:
					System.out.println("select valid operation...!");
					System.out.println("---------------------------");
				}

			}
			

		}


	}

	


