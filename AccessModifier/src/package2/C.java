package package2;
import package1.*;

public class C {
	
              String defaultMessage   = "no Modifier: the class and same package";
	public    String publicMessage    = "public: available everywhere";
	protected String protectedMessage = "protected: the class and same package and subClass";
	private   String privateMessage   = "protected: the class only";
	
	// 3-2.
	public void printOut() {
		System.out.println("Add public method for protectedMessage " + protectedMessage);
	}

}
