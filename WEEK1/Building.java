import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int high = input.nextInt();
        
        for (int i = 0; i < high; i++) {
            for (int j = 0 ; j < 5; j++){
                if (j == 4) {
                    System.out.print("#");
                }
                else {
                    System.out.print("#-");
                }
            }
            System.out.println("");
        }
    }
}
