import java.util.Scanner;

public class Vat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price = input.nextDouble();
        double price_vat = price * 1.07;
        System.out.print("Last Price is "+price_vat);
        input.close();
    }
}
