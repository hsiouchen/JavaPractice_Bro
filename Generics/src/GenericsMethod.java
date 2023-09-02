
public class GenericsMethod {
	
	// generics = 	enable types (classes and interfaces) to be parameters when defining:
	// 				classes, interfaces and methods

	// 				a benefit is to eliminate the need to create multiple versions
	// 				of methods or classes for various data types.
	// 				Use 1 version for all reference data (wrap class) types.
	
	GenericsMethod() {
		
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 5.8, 4.7, 3.6, 2.5, 1.4 };
		Character[] charArray = { 'A', 'P', 'P', 'L', 'E' };
		String[] stringArray = { "G", "O", "O", "D" };

//		displayArray(intArray);
//		displayArray(doubleArray);
//		displayArray(charArray);
//		displayArray(stringArray);
		
		System.out.println(getFirst(intArray));
		System.out.println(getFirst(doubleArray));
		System.out.println(getFirst(charArray));
		System.out.println(getFirst(stringArray));
		
	}
	

	public static <E> void displayArray(E[] array) {

		for (E x : array) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	public static <E> E getFirst(E[] array) {
		return array[0];
	}
/*	
	public static <Element> Thing getFirst(Element[] array) {
		return array[0];
	}
	
	public static <Element> void displayArray(Element[] array) {

		for (Thing x : array) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
*/	
/*	
	public static void displayArray(Integer[] array) {

		for (Integer x : array) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

	public static void displayArray(Double[] array) {

		for (Double x : array) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

	public static void displayArray(Character[] array) {

		for (Character x : array) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

	public static void displayArray(String[] array) {

		for (String x : array) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
*/

}
