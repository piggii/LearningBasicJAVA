import java.util.Scanner;

public class BasicLoop_MutiplicationTable {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to create multiplication table : ");
        int number = input.nextInt();
        System.out.println("*****************");
        System.out.println("  " + number + " Times table");
        System.out.println("*****************");
        for (int i = 1; i <= 12; i++) {
            if (i <= 9) {
                System.out.println("  " + number + " x " + i + "  = " + (number * i));
            } else {
                System.out.println("  " + number + " x " + i + " = " + (number * i));
            }
        }
        System.out.println("*****************");
    }
}
