
import java.io.*;
import java.util.Scanner;

public class Producer {
    public static void main(String[] args) {
        ScoreTable scoreTable = new ScoreTable();
        Scanner scan = new Scanner(System.in);

        try {
            File myObj = new File("score.txt");
            FileWriter fileWriter = new FileWriter("score.txt",true);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bw);

            System.out.println("Enter the match score: ");
            String [] score = scan.nextLine().split("\\s+");
            scoreTable.setTeam1(score[0]);
            scoreTable.setTeam2(score[4]);
            scoreTable.setGoalTeam1(Integer.parseInt(score[1]));
            scoreTable.setGoalTeam2(Integer.parseInt(score[3]));
            printWriter.append(scoreTable.toString()+"\n");
            printWriter.close();
            fileWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
