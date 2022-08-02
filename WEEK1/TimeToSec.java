import java.util.Scanner;

public class TimeToSec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hours, mins, secs;
        hours = input.nextInt();
        mins = input.nextInt();
        secs = (hours*60 + mins)*60;
        System.out.print("Secs is " + secs);
        input.close();
    }
}
