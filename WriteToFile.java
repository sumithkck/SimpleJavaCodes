import java.io.*;

public class WriteToFile {

    public static void main(String args[]) {
        File file = new File("JAVA/MyFile.txt");

        try (FileWriter fileWriter = new FileWriter(file)) {

            fileWriter.write("This is amazing guys...");
            fileWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
