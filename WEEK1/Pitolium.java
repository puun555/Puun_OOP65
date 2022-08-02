import java.util.Scanner;

public class Pitolium {
    public static void main(String[] args) {
        int val, cost;
        Scanner input = new Scanner(System.in);
        val = input.nextInt();
        input.close();
        cost = val * 30;
        System.out.print("Price is " + cost + "Baht");
    }
}
