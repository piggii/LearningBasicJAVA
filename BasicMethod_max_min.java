import java.util.*;

public class BasicMethod_max_min {
    public static void main(String[] args) {
        Scanner select = new Scanner(System.in);
        System.out.println("Select mode : Find max [1] or Find min [2]");
        System.out.print("Enter mode : ");
        int mode = select.nextInt();
        if (mode == 1) {
            Scanner input = new Scanner(System.in);
            System.out.println("\"Find the biggest number\"");
            System.out.print("Enter first number : ");
            float num1 = input.nextFloat();
            System.out.print("Enter second number : ");
            float num2 = input.nextFloat();
            System.out.print("Enter third number : ");
            float num3 = input.nextFloat();
            System.out.print("The biggest number is " + maxNum(num1, num2, num3));

        } else {
            Scanner input = new Scanner(System.in);
            System.out.println("\"Find the smallest number\"");
            System.out.print("Enter first number : ");
            float num1 = input.nextFloat();
            System.out.print("Enter second number : ");
            float num2 = input.nextFloat();
            System.out.print("Enter third number : ");
            float num3 = input.nextFloat();
            System.out.print("The smallest number is " + minNum(num1, num2, num3));
        }
    }

    public static float maxNum(float number1, float number2, float number3) {
        float number = Math.max(Math.max(number1, number2), number3);
        return number;
    }

    public static float minNum(float number1, float number2, float number3) {
        float number = Math.min(Math.min(number1, number2), number3);
        return number;
    }
}
