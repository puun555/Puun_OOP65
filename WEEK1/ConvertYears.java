import java.util.Scanner;

public class ConvertYears {
    public static void main(String[] args) {
        int ad, be, to_AD = -543;
        Scanner input = new Scanner(System.in);
        be = input.nextInt();
        ad = be + to_AD;
        System.out.println("B.D. to A.D is " + ad);
        input.close();
    }
}
