import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Yea, though I walk through the valley of the shadow of death, \n"
					+ "I will fear no evil: for thou art with me; \n"
					+ "thy rod and thy staff they comfort me.");
			writer.append("\n\nPsalm 23:4");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
