package com.mypractices;

public class EarlyInitialization {

	
		
		//instance or object will be created at the load time
		private static EarlyInitialization obj = new EarlyInitialization();
		public String str;
		
		//create private constructor
		private EarlyInitialization() {
			
			str= "Colors of the World";	
		}
		//Declaring static method
		public static EarlyInitialization getInstance() {
			
			return obj;
		}
		
		

		public static void main(String[] args) {
		
			EarlyInitialization text= EarlyInitialization.getInstance();	
			
			//orginal string 
			System.out.println("Original String:");
			System.out.println(text.str);
			
			//test in upper case
			System.out.println("String in Upper Case");
			text.str = (text.str).toUpperCase();	
			System.out.println(text.str);
			
		

	}

}
