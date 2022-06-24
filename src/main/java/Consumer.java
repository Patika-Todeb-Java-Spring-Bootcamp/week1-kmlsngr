import java.io.File;
import java.io.FileNotFoundException;
import java.security.SecureRandom;
import java.util.Scanner;

public class Consumer  implements Runnable{



    @Override
    public void run() {
            String lastLine = "";
            try {
                File myObj = new File("score.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    lastLine = myReader.nextLine();
                }
                System.out.println(lastLine);
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();


    }}}
