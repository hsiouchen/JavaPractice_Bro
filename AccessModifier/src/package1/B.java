package package1;
import package2.*;

public class B {

	private   String privateMessage   = "protected: the class only";
	
	// 4-2.
	public void printOut() {
		System.out.println("Add public method for privateMessage " + privateMessage);
	}
	
}
