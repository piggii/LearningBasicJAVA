import java.util.*;

public class BasicMethod_isEven {
    public static boolean isEven(int x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (;;) {
            System.out.print("Enter number : ");
            int number = input.nextInt();
            if (isEven(number) == true) {
                System.out.println(number + " is even");
            } else {
                System.out.println(number + " is odd");
            }
        }
    }
}
