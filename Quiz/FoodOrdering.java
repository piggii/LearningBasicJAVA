import java.util.*;

public class FoodOrdering {
    public static ArrayList<String> newMenu = new ArrayList<String>();
    public static ArrayList<Integer> newPrice = new ArrayList<Integer>();
    public static int priceLen;

    public static void main(String[] args) {
        SelectMode();
    }

    // Select mode between "Ordering food" and "Add new menu"

    public static void SelectMode() {
        Scanner inputMode = new Scanner(System.in);
        for (;;) {
            System.out.println(">>> SELECT MODE <<<");
            System.out.println("[1] Ordering food");
            System.out.println("[2] Add new menu");
            System.out.print("Mode : ");
            int mode = inputMode.nextInt();
            if (mode == 1) {
                System.out.println("");
                System.out.println(">>>>>>>\"ORDERING FOOD MODE\"<<<<<<<");
                showMenu();

            } else if (mode == 2) {
                System.out.println("");
                System.out.println(">>>>>>>\"ADD NEW MENU MODE\"<<<<<<<<");
                addMenu();

            } else {
                System.out.println("");
                System.out.println("***Please select only 1-2***\n");
            }
        }
    }

    // Show all menu

    public static void showMenu() {
        ArrayList<String> allMenu = new ArrayList<String>();
        ArrayList<Integer> allPrice = new ArrayList<Integer>();
        allMenu.addAll(newMenu);
        allPrice.addAll(newPrice);
        System.out.println("----------------------------------");
        System.out.println("               MENU               ");
        System.out.println("----------------------------------");
        for (int INDEX = 0; INDEX < allMenu.size(); INDEX++) {
            System.out.println(INDEX + 1 + ". " + allMenu.get(INDEX) + allPrice.get(INDEX) + " Baht");
        }
        System.out.println("----------------------------------\n");
    }

    // Add new menu from user

    public static ArrayList<String> addMenu() {
        Scanner inputMenu = new Scanner(System.in);
        String exit = "EXIT";
        System.out.println("**Enter \"exit\" to confirm**");
        for (;;) {
            System.out.print("Enter new menu : ");
            String menu = inputMenu.nextLine();
            if (menu.toUpperCase().equals(exit)) {
                /*
                 * System.out.println("----------------------------------");
                 * System.out.println("             NEW MENU             ");
                 * System.out.println("----------------------------------"); for (int index = 0;
                 * index < newMenu.size(); index++) { System.out.println(index + 1 + ". " +
                 * newMenu.get(index) + newPrice.get(index) + " Baht"); }
                 * System.out.println("----------------------------------\n");
                 */
                System.out.println("");
                return newMenu;
            }
            addPrice();
            menu = menu + spaceBar(menu.length());
            newMenu.add(menu);
        }
    }

    // Add the price of the new menu from user

    public static ArrayList<Integer> addPrice() {
        Scanner inputPrice = new Scanner(System.in);
        System.out.print("Enter price : ");
        int price = inputPrice.nextInt();
        priceLen = Integer.toString(price).length();
        newPrice.add(price);
        return newPrice;
    }

    // Add space to adjust the display

    public static String spaceBar(int length) {
        String space = "";
        String newSpace = " ";
        if (priceLen == 1) {
            for (int LENGTH = length; LENGTH < 25; LENGTH++) {
                space = space + newSpace;
            }
        } else if (priceLen == 2) {
            for (int LENGTH = length; LENGTH < 24; LENGTH++) {
                space = space + newSpace;
            }
        } else if (priceLen == 3) {
            for (int LENGTH = length; LENGTH < 23; LENGTH++) {
                space = space + newSpace;
            }
        }
        return space;
    }
}
