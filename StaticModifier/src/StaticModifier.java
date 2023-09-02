
public class StaticModifier {

	// static = modifier. 
	//          A single copy of a variable/method/(class) is created and shared.
	//          The class "owns" the static member
	
	public static void main(String[] args) {

		Friend friend1 = new Friend("Lucy");
		Friend friend2 = new Friend("Phoebe");
		Friend friend3 = new Friend("Joseph");
		
		
		//Remove static modifier
		System.out.println(friend1.numberOfFriends);		
		// better used the Class to instead the object
		System.out.println(Friend.numberOfFriends);
		
		Friend friend4 = new Friend("Eva");
		
		Friend.displayFriends();
		
	}

}
