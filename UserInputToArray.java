import java.util.*;

public class UserInputToArray {
    public static int size = 0;
    public static String myMenu[] = new String[size];
    public static int newSize = myMenu.length + 1;
    public static String newMenu[] = new String[newSize];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String exit = "EXIT";
        System.out.println("Enter new menu : ");
        for (;;) {
            String Menu = input.nextLine();
            int newSize = myMenu.length + 1;
            String newMenu[] = new String[newSize];
            System.arraycopy(myMenu, 0, newMenu, 0, myMenu.length);
            myMenu = newMenu;
            myMenu[myMenu.length - 1] = Menu;
            if (Menu.toUpperCase().equals(exit)) {
                List<String> list = new ArrayList<String>(Arrays.asList(myMenu));
                list.remove(myMenu.length - 1);
                myMenu = list.toArray(new String[0]);
                System.out.println("----------------------------------");
                System.out.println("               MENU               ");
                System.out.println("----------------------------------");
                for (int i = 0; i < myMenu.length; i++) {
                    System.out.println(i + 1 + ". " + myMenu[i]);
                }
                System.out.println("----------------------------------");
                break;
            }
        }
    }
}
