package package2;
import package1.*;

public class Asub extends A {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C c = new C();
		
		// 1. no modifier variable: Class, Package
		//System.out.println(c.defaultMessage);
		
		
		// 2.  public variable: Class, Package, Subclass, World
		//System.out.println(c.publicMessage);
		
		// no modifier class: only available in the same package 
		//CNo cNo = new CNo();
		//System.out.println(cNo.defaultMessage);
		
		
		// 3. protected variable: Class, Package, Subclass
		// System.out.println(c.protectedMessage);
		//Asub aSub = new Asub();
		//System.out.println(aSub.protectedMessage);
		
		
		// 4. private variable: Class only
		//The field C.privateMessage is not visible
		//System.out.println(c.privateMessage);
		
		
		
		
	}

}
