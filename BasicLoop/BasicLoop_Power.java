import java.util.Scanner;

public class BasicLoop_Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base number : ");
        int num = input.nextInt();
        System.out.print("Enter the power : ");
        int power = input.nextInt();
        int result = 1;
        for (int i = 1; i <= power; i++) {

            result = result * num;
        }
        System.out.print("Result : " + result);
    }
}
