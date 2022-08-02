import java.util.Scanner;

public class Squre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side = input.nextDouble();
        double area = side*side;
        input.close();
        System.out.print("Area is "+ area);
    }
}
