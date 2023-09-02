import java.util.Scanner;

public class Main {
	
	// exception = 	an event that occurs during the execution of a program that,
	//          	disrupts the normal flow of instructions

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Enter a number to divide: ");
			int x = scan.nextInt();
			
			System.out.println("Enter a number to divide by : ");
			int y = scan.nextInt();
			
			int z = x/y;
			
			System.out.println("result: " + z);
		}
		catch (java.lang.ArithmeticException e) {
			System.out.println("You can't divide by zero!");
		}
		catch (java.util.InputMismatchException e) {
			System.out.println("PLEASE ENTER A NUMBER !!!");
		}
		catch (Exception e) {
			System.out.println("Something went wrong");
		}
		finally {
			//System.out.println("This will always print");
			scan.close();
		}		

	}

}
