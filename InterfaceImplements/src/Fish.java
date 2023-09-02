
public class Fish implements Prey, Predator {

	@Override
	public void hunt() {
		System.out.println("implements for interface (Predator):\n"+"*This fish is hunting smaller fish*");		
	}

	@Override
	public void flee() {
		System.out.println("implements for interface (Prey):\n"+"The fish is fleeing from a larger fish*");		
	}

}
