import java.util.*;

public class BasicMethod_getTotal {
    public static int getTotal(int x, int y) {
        int z = x + y;
        return z;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputChar = new Scanner(System.in);
        for (;;) {
            System.out.print("Enter 1st number : ");
            int num1 = input.nextInt();
            System.out.print("Enter 2st number : ");
            int num2 = input.nextInt();
            int sum = getTotal(num1, num2);
            System.out.println("Sum = " + sum);
            System.out.println("Do you want to exit the program? [y/n]");
            char Quit = inputChar.nextLine().charAt(0);
            int exit = (int) Quit;
            if (exit == 89 || exit == 121) {
                System.out.print("Exit program");
                break;
            } else {
                continue;
            }
        }

    }
}
