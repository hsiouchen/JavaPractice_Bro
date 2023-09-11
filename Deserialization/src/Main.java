import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {

	// Serialization = 	The process of converting an object into a byte stream.
	// 					Persists (saves the state) the object after program exits
	// 					This byte stream can be saved as a file or sent over a network
	// 					Can be sent to a different machine
	// 					Byte stream can be saved as a file (.ser) which is platform independent
	// 					(Think of this as if you're saving a file with the object's information)

	// Deserialization = The reverse process of converting a byte stream into an 
	// 					 object.
	// 					 (Think of this as if you're loading a saved file)
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		// 				Steps to Deserialize
		// 				---------------------------------------------------------------------
		// 				1. Declare your object (don't instantiate)
		//				2. Your class should implements Serializable interface
		// 				3. add import java.io.Serializable;
		// 				4. FileInputStream fileIn = new FileInputStream( "path/filename" );
		// 				5. ObjectInputStream in = new ObjectInputStream( fileIn );
		// 				6. objectName = (Class name) in.readObject();
		// 				7. in.close(); fileIn.close();
		// 				---------------------------------------------------------------------
		
		User user = null;		// 1. Declare your object (don't instantiate)
		FileInputStream fileIn = new FileInputStream("..//Serializtion//UserInfo.ser");
		// /home/code/eclipse-workspace/Serializtion/UserInfo.ser
		ObjectInputStream in = new ObjectInputStream( fileIn );
		user = (User) in.readObject();
		in.close(); 
		fileIn.close();

		System.out.println(user.name);
		System.out.println(user.password);
		user.sayHello();
	}

}
