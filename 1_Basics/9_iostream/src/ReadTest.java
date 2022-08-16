import java.io.FileReader;
import java.io.IOException;

public class ReadTest {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("/Users/highcho/Desktop/Coding/STUDY_JAVA/1_Basics/9_iostream/src/db.properties")) {
            int i;
            while ((i = fr.read()) != -1) {
                System.out.println((char) i);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
