import java.util.Arrays;
import java.util.Scanner;
public class TestUserInputToArray {
    public static void main(String[] args) {
        addnewstring();
    }

    public static void addnewstring() {
        Scanner userInput = new Scanner(System.in);
        String exit = "EXIT";
        int length = 10;
        String[] newstring = new String[length];
        System.out.println("Enter new string : ");
        for (int i = 0; i < length; i++) {
            String addstring = userInput.next();
            if (addstring.toUpperCase().equals(exit)) {
                break;
            } else {
                newstring[i] = addstring;
            }
        }
        System.out.println(Arrays.toString(newstring));

    }
}
