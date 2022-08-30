import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        double tax = 0;
        if (salary > 50000) {tax = 0.10;}
        else {tax = 0.05;}
        System.out.println("Your Tax is : " + (salary*tax));
    }
}
