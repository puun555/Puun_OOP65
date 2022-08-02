import java.util.Scanner;

public class AvgScore {
    public static void main(String[] args) {
        int score_1, score_2, score_3;
        float avg ;
        Scanner input = new Scanner(System.in);
        score_1 = input.nextByte();
        score_2 = input.nextByte();
        score_3 = input.nextByte();
        avg = (score_1 + score_2 + score_3)/3;
        System.out.print("Average Score = " + avg);
        input.close();
    }
}
