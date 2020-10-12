import java.util.Arrays;
import java.util.Scanner;
public class TestUserInputToArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length : ");
        int length = input.nextInt();
        String[] userInput = new String[length];
        System.out.println("Enter new string :");
        for(int i = 0; i < length; i++){
            String addInput = input.nextLine();
            userInput[i] = addInput;
        }
        String newInput = Arrays.toString(userInput);
        System.out.println(newInput);
    }
}
