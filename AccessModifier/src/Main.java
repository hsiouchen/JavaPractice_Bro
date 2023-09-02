
public class Main {
	
	//                   Access Modifier
	
	// Modifier		Class	Package		Subclass	World
	// --------     -----   -------     --------    -----
	//  public        Y        Y            Y         Y
	//  protected     Y        Y            Y         N 
	// no midifier    Y        Y            N         N
	//  private       Y        N            N         N

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  no midifier
		//  -----------
		// 1. Start from class C : add defaultMessage
		//          then A
		//          then Asub
		
		//  public
		//  ------
		// 2. Start from class C : add publicMessage
		//          then Asub
		//          and  A
		
		
		//  protected
		//  ---------
		// 3. Start from class C : add protectedMessage
		//          then Asub
		//          then A 
		//    Then             A : add protectedMessage and print out the message
		//          then Asub : new object and print out the protectedMessage
		//
		// 3-2. C Add  public printOut() method
		//                then A : c.printOut();
		
		
		
		
		//  private
		//  -------
		// 4. Start from class C : add privateMessage
		//          then Asub: print The field C.privateMessage is not visible
		//     Then            B : add privateMessage
		//     Then            A : add B object
		//           print out b : The field C.protectedMessage is not visible
		//
		// 4-2. B Add  public printOut() method
		//                then A : b.printOut();

		
		
	}

}
