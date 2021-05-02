import java.io.*;

public class ReadInputs {

	public static void main(String args[]) throws IOException {

		File file = new File("JAVA/Text.txt");

		try (FileInputStream fileInputStream = new FileInputStream(file)) {

			System.out.println("Total size to read in bytes is " + fileInputStream.available());
			int content;
			while ((content = fileInputStream.read()) != -1) {
				System.out.print((char) content);
			}

		} catch (Exception e) {

		}

	}
}
