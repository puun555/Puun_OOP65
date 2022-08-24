import java.util.Scanner;

public class CityBank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your money : ");
        double money = input.nextDouble();
        System.out.println("Input your account type(Please type A B C or Xin uppercase) : ");
        char plan = input.next().charAt(0);
        if (plan == 'A' || plan == 'C') { money = money + money * 0.015;}
        else if (plan == 'B') { money *= 1.02;}
        else if (plan == 'X') {money *= 1.05;}
        System.out.println("Your total money in one year = " + money);
        
    }
}
