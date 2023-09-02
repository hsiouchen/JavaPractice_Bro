package com.mycode;

public class ExpressionInJava {

	// expression = operands & operators
	// operands = values, variables, number, quantity
	// operators = + - * / % ++ -- += -= *= /= %/
	
	public static void main(String[] args) {
	
		int candy = 7;
		
		// + - += -= ++ --
		System.out.println("I have " + candy + " Candy.");
		candy = candy + 1;
		System.out.println("candy = candy + 1 : " + candy);
		candy += 1;
		System.out.println("candy += 1          " + candy);
		candy++;
		System.out.println("candy++             " + candy);
		candy = candy - 1;
		System.out.println("candy = candy - 1   " + candy);
		candy -= 1;
		System.out.println("candy -= 1          " + candy);
		candy--;
		System.out.println("candy--             " + candy);
		
		
		// * / *= /=
		candy = candy * 2;
		System.out.println("candy = candy * 2 : " + candy);
		candy = candy / 2;
		System.out.println("candy = candy / 2 : " + candy);
		candy *= 2;
		System.out.println("candy *= 2 :        " + candy);
		candy /= 2;
		System.out.println("candy /= 2 :        " + candy);
		
		
		// % %=
		candy = candy % 2;
		System.out.println("candy = candy % 2 : " + candy);
		candy %= 2;
		System.out.println("candy %= 2 :        " + candy);
		
		
		double cookie = 8;
				
		cookie = (double) cookie / 3;
		System.out.println("cookie / 3 :        " + cookie);
		
	}	
}
