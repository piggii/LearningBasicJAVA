import java.util.*;

public class StackAlphabet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String KeepAlphabet = "";
        System.out.print("Enter Alphabet : ");
        char inputAlphabet = input.nextLine().charAt(0);
        int Alphabet = (int) inputAlphabet;
        if (Alphabet >= 65 && Alphabet <= 90) {
            for (int i = 65; i <= Alphabet; i++) {
                KeepAlphabet = KeepAlphabet + (char) i;
                System.out.println(KeepAlphabet);
            }
        } else if (Alphabet >= 97 && Alphabet <= 122) {
            for (int i = 97; i <= Alphabet; i++) {
                KeepAlphabet = KeepAlphabet + (char) i;
                System.out.println(KeepAlphabet);
            }
        } else {
            System.out.print("Please enter a-z or A-Z");
        }
        input.close();
    }
}
