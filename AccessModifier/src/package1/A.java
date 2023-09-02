package package1;
import package2.*;

//                   Access Modifier

// Modifier		Class	Package		Subclass	World
// --------     -----   -------     --------    -----
//  public        Y        Y            Y         Y
//  protected     Y        Y            Y         N 
// no midifier    Y        Y            N         N
//  private       Y        N            N         N


public class A {
	
	protected String protectedMessage = "protected: the class and same package and subClass";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C c = new C();
		
		// 1. no modifier variable: Class, Package
		// not working here
		//System.out.println(c.defaultMessage);
		
		
		// 2.  public variable: available Class, Package, Subclass, World
		//System.out.println(c.publicMessage);
		
		// no modifier Class: only available in the same package
		// The type C2no is not visible
		//C2no cNo = new C2no();
		
		
		// 3. protected variable: Class, Package, Subclass
		//    The field C.protectedMessage is not visible
		//System.out.println(c.protectedMessage);
		// 3-2. add public printOut() method
		//c.printOut();
		
		
		// 4. private variable: Class only
		B b = new B();
		//    The field C.protectedMessage is not visible
		//System.out.println(b.privateMessage);

		// 4-2. add public printOut() method
		b.printOut();		
		
	}
}
