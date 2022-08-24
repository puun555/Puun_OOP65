import java.util.*;
public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert your name : ");
        String name = input.nextLine();
        System.out.println("Please insert your age : ");
        int age = input.nextInt();
        System.out.println("Please insert number of working days : ");
        double numDay1 = input.nextDouble();
        System.out.println("Please insert number of absent days : ");
        double numDay2 = input.nextDouble();
        System.out.println("Please insert your your body weight : ");
        double weight = input.nextDouble();

        double salary = 0;
        if ((age >= 21) && (age <= 30)) {
            salary = (numDay1 * 300) - (numDay2 * 50);
        }
        else if ((age >= 31) && (age <= 40)) {
            salary = (numDay1 * 500) - (numDay2 * 50);
        }
        else if ((age >= 41) && (age <= 50)) {
            salary = (numDay1 * 1000) - (numDay2 * 25);
        }
        else if ((age >= 51) && (age <= 60)) {
            salary = (numDay1 * 3000);
        }

        double salary2 = 0;
        if (weight >= 10 && weight <= 60){
            salary2 = salary + 5000;
        }
        else if (weight >= 60 && weight <= 91){
            salary2 = salary + (5000 - ((weight-60) * 10));
        }

        System.out.println("Hi, " + name);
        System.out.println("Your salary is "+ (int) salary + " Baht");
        System.out.println("Your salary and bonus is " + (int) salary2 + " Baht");
    }
}
