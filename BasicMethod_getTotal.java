import java.util.*;

public class BasicMethod_getTotal {
    public static int getTotal(int x, int y) {
        int z = x + y;
        return z;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = input.nextInt();
        System.out.print("Enter 2st number : ");
        int num2 = input.nextInt();
        int sum = getTotal(num1, num2);
        System.out.print("Sum = " + sum);
        input.close();
    }
}
