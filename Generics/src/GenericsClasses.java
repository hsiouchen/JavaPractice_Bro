import java.util.ArrayList;
import java.util.HashMap;

public class GenericsClasses {
	
	GenericsClasses() {
		
//		MyIntegerClass    myInt = new MyIntegerClass(5);
//		MyDoubleClass  myDouble = new MyDoubleClass(3.14159);
//		MyCharacterClass myChar = new MyCharacterClass('@');
//		MyStringClass  myString = new MyStringClass("Hello");
/*		
		MyGenericClass <Integer>     myInt = new MyGenericClass<>(5);
		MyGenericClass <Double>   myDouble = new MyGenericClass<>(3.14159);
		MyGenericClass <Character>  myChar = new MyGenericClass<>('@');
		MyGenericClass <String>   myString = new MyGenericClass<>("Hello");
		
		System.out.println(   myInt.getValue());
		System.out.println(myDouble.getValue());
		System.out.println(  myChar.getValue());
		System.out.println(myString.getValue());
		
		
		ArrayList<String> Students = new ArrayList<String>();		
*/		
		
		
		//HashMap<Integer, String> Employee = new HashMap<>();
		
		MyGenericClass2 <Integer, Float>       myInt = new MyGenericClass2<>(5, 3.14f);
		MyGenericClass2 <Double, Integer>   myDouble = new MyGenericClass2<>(3.14159, 8);
//		MyGenericClass2 <Character, Integer>  myChar = new MyGenericClass2<>('@', 2);
//		MyGenericClass2 <String, Character> myString = new MyGenericClass2<>("Hello", '&');
		
		System.out.println(   myInt.getValue2());
		System.out.println(myDouble.getValue2());
//		System.out.println(  myChar.getValue2());
//		System.out.println(myString.getValue2());
		
	}

}
