package com.userDefinedMethods;

public class Example2 {
	
		//user defined method
		
		//user defined method definition
		public static void getMessage(String text)//text parameter
		{
			//method body/implementation
			System.out.println(text);
		}
		
		public static String getMessage1(String text)//text parameter
		{
			return text;
		}
		
		//main method is predefined method
		public static void main(String[] args)
		{
			//calling user defined method
			getMessage("Hello Swathi");//calling method by passing arguments/values
			
			System.out.println(getMessage1("Hello Girl"));
		}

	}
	


