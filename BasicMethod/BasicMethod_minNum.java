import java.util.*;

public class BasicMethod_minNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        float num1 = input.nextFloat();
        System.out.print("Enter second number : ");
        float num2 = input.nextFloat();
        System.out.print("Enter third number : ");
        float num3 = input.nextFloat();
        System.out.print("The Smallest number is " + (minimum(num1, num2, num3)));

    }

    public static float minimum(float number1, float number2, float number3) {
        float number = Math.min(Math.min(number1, number2), number3);
        return number;
    }
}
