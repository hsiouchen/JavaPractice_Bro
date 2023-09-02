package com.mycode;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = scanner.nextLine();
		
		System.out.println("How old are you?");
		int age = scanner.nextInt();
		// if you didn't type int then you will have 
		// Exception in thread "main" java.util.InputMismatchException
		
		/*
		 * After nextInt()
		 * 
		 * when used nextInt() method
		 * enter 'number'(Int) and press the 'entry'(\n)
		 * Scanner only take the 'number'(Int) from Scanner
		 * and left the 'entry'(\n) inside the Scanner
		 * so, nextLine() already had \n inside the Scanner
		 * after call the nextInt()
		 * one way we could do is add nextLine() to clear the Scanner 
		 */
		scanner.nextLine();
		
		System.out.println("What is your favorite food?");
		String food = scanner.nextLine();
		
		System.out.println("Hello " + name);
		System.out.println("You are " + age +" years old.");
		System.out.println("You like " + food);

	}

}
