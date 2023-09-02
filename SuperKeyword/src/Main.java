
public class Main {

	// super = keyword refers to the superclass (parent) of an object
	//		   very similar to the "this" keyword
	
	public static void main(String[] args) {

//		Hero hero = new Hero();
//		
//		hero.name = "Batman";
//		hero.age = 42;
//		hero.power = "$$$";
		
		Hero hero = new Hero("Batman", 42, "$$$");
		
//		System.out.println(hero.name);
//		System.out.println(hero.age);
//		System.out.println(hero.power);

		// if no toString() Method, will return the address of this object in memory
		// System.out.println(hero);


		Hero hero2 = new Hero("Superman", 35, "$$$$$");
		// System.out.println(hero2);
		System.out.println(hero2.toString());
	}

}
