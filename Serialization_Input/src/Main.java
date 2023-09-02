import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	// Serialization = The process of converting an object into a byte stream.
	// Persists (saves the state) the object after program exits
	// This byte stream can be saved as a file or sent over a network
	// Can be sent to a different machine
	// Byte stream can be saved as a file (.ser) which is platform independent
	// (Think of this as if you're saving a file with the object's information)

	// Deserialization = The reverse process of converting a byte stream into an
	// object.
	// (Think of this as if you're loading a saved file)

	public static void main(String[] args) throws IOException {

		// 				Steps to Serialize
		// 				---------------------------------------------------------------------
		// 				1. Your object class should implement Serializable interface
		// 				2. add import java.io.Serializable;
		// 				3. FileOutputStream fileOut = new FileOutputStream( "path/filename" );
		// 				4. ObjectOutputStream out = new ObjectOutputStream( fileOut );
		// 				5. out.writeObject(objectName)
		// 				6. out.close(); fileOut.close();
		// 				---------------------------------------------------------------------

		User user = new User();
		user.name = "Apple";
		user.password = "asdf@#123";

		//user.sayHello();

		FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(user);
		out.close();
		fileOut.close();
		
		System.out.println("Serialization: Object Info saved!");

	}

}
