package com.mycode;

// Defeat the algorithm

/*
 *  Variable
 *  
 *  a placeholder for a value that
 *  behaves as the value it contains
 */

public class Variable {

	public static void main(String[] args) {
			
		/* int */
		// int x;			// declaration 
		// x = 123;		// assignment
		
		int x = 123;		// initialization
		
		// System.out.println(x);						// printing variable x
		// System.out.println("x"); 					// printing out the x string
		// System.out.println("The number is : " + x); 	// printing out the x string
		
		/* long */
		// int ly = 1234567890123456789; 		// to large to in store in int variable
		// long y = 1234567890123456789; 	// have to used long data type,
		long y = 1234567890123456789L; 		// need to follow these with L
		// System.out.println(y);
		
		/* byte */
		byte b1 = 127;			// -128 to 127
		// byte b2 = 128;		// to much for byte
		int b2 = 128;
		// System.out.println(b1);
		// System.out.println(b2);
		
		/* double */
		// int d = 3.141592								// have to used float or double for decimal
		float df = 3.141592f;							// need to follow these with f
		double dd = 3.141592653589793;	// popular used double
		// System.out.println(df);
		// System.out.println(dd);
		
		/* boolean */
		boolean tf = false;
		// System.out.println(tf);
		
		/* char */
		char symbol = '@'; 	// you could name the char for meaning
		//System.out.println(symbol);
		
		/* String */
		String myName = "Martha";
		System.out.println("Hello " + myName);
		
	}

}
