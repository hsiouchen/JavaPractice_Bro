import java.util.Random;

public class GlobalVariable {
	
	// declare the global variable
	Random random;
	int number;
	
	GlobalVariable() {
		random = new Random();
		times();
	}

	void times() {
		number = random.nextInt(6)+1;
		System.out.println(number);
	}

}
