import java.io.File;
import java.io.FileNotFoundException;
import java.security.SecureRandom;
import java.util.Scanner;

public class Consumer {
    public static void main(String[] args) {
        String lastLine = "";
        try {
            File myObj = new File("score.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                lastLine = data;
            }
            System.out.println();
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
