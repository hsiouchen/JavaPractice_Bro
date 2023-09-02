import java.io.File;

public class Main {
	
	// file = 	An abstract representation of file and directory pathnames

	public static void main(String[] args) {

		//File file = new File("D:\\00 IT Projects\\eclipse-workspace\\file_message.txt");
		//File file = new File("D:/00 IT Projects/eclipse-workspace/file_message.txt");
		
		File file = new File("file_message.txt");
		
		if(file.exists()) {			
			System.out.println("That file exists! :o!");
			
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			
			System.out.println("isFIle: " + file.isFile());
			System.out.println("canExecute: " + file.canExecute());
			System.out.println("canRead: " + file.canRead());
			System.out.println("getParent: " + file.getParent());

			file.delete();
		}
		else {
			System.out.println("That file doesn't exist! :(");
		}

		
	}

}
