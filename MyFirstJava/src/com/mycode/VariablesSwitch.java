package com.mycode;

public class VariablesSwitch {

	public static void main(String[] args) {
		
		String x = "Apple juice";
		String y = "Kool-Aid";
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
		// Switch
		String tmp = "";
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("\nAfter switch");
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
		
		
	}	
}
