
public class ArrayOnObject {

	public static void main(String[] args) {
		
//		int[] numbers = new int[3];
//		char[] characters = new char[4];
//		String[] strings =new String[5];		
		
		
		
		Food food1 = new Food( "pizza" );
		Food food2 = new Food( "hamburger" );
		Food food3 = new Food( "hotdog" );
		
		
//		Food[] refrigerator = new Food[];		
//		refrigerator[0] = food1;
//		refrigerator[1] = food2;
//		refrigerator[2] = food3;
		
		
		Food[] refrigerator = {food1, food2, food3};
		
		
		// refrigerator's address in memory
		// System.out.println(refrigerator);
		
		// Instead
		System.out.println(refrigerator[0].name);
		
//		for (int i = 0; i < refrigerator.length; i++) {
//			System.out.println(refrigerator[i].name);
//		}

		
	}

}
