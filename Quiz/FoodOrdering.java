import java.util.*;

public class FoodOrdering {
    public static ArrayList<String> allMenu = new ArrayList<String>();
    public static ArrayList<Integer> allPrice = new ArrayList<Integer>();
    public static ArrayList<String> newMenu = new ArrayList<String>();
    public static ArrayList<Integer> newPrice = new ArrayList<Integer>();
    public static ArrayList<Integer> newOrder = new ArrayList<Integer>();
    public static ArrayList<Integer> Selected = new ArrayList<Integer>();
    public static int priceLen;

    public static void main(String[] args) {
        // Select mode between "Ordering food" and "Add new menu"
        Scanner inputMode = new Scanner(System.in);
        for (;;) {
            System.out.println(">>> SELECT MODE <<<");
            System.out.println("[1] Ordering food");
            System.out.println("[2] Add new menu");
            System.out.print("Mode : ");
            int mode = inputMode.nextInt();
            if (mode == 1) {
                System.out.println("");
                System.out.println(">>>>>> \"ORDERING FOOD MODE\" <<<<<<");
                orderingMenu();

            } else if (mode == 2) {
                System.out.println("");
                System.out.println(">>>>>> \"ADD NEW MENU MODE\" <<<<<<<");
                addnewMenu();

            } else {
                System.out.println("");
                System.out.println("***Please select only 1-2***\n");
            }
        }
    }

    // Show all menu

    public static void orderingMenu() {
        Scanner inputOrder = new Scanner(System.in);
        allPrice.clear();
        allMenu.clear();
        allMenu.addAll(newMenu);
        allPrice.addAll(newPrice);
        System.out.println("----------------------------------");
        System.out.println("               MENU               ");
        System.out.println("----------------------------------");
        for (int INDEX = 0; INDEX < allMenu.size(); INDEX++) {
            System.out.println(INDEX + 1 + ". " + allMenu.get(INDEX) + allPrice.get(INDEX) + " Baht");
        }
        System.out.println("----------------------------------");
        System.out.println("**Enter \"0\" to confirm order**");
        System.out.println("Enter number to select order : ");
        for (int trig = 0; trig < 1;) {
            int selectOrder = inputOrder.nextInt();
            if (selectOrder == 0) {
                calculate();
                trig++;
            } else {
                newOrder.add(selectOrder);
                Selected.add(selectOrder);
                System.out.println(allMenu.get(Selected.get(0) - 1) + allPrice.get(Selected.get(0) - 1) + " Baht");
                Selected.clear();
            }
        }
    }

    public static void calculate() {
        int total = 0;
        System.out.println("----------------------------------");
        System.out.println("             Receipt              ");
        System.out.println("----------------------------------");
        for (int box = 0; box < newOrder.size(); box++) {
            System.out.println(box + 1 + ". " + allMenu.get(newOrder.get(box) - 1) + allPrice.get(newOrder.get(box) - 1)
                    + " Baht");
            total = total + allPrice.get(newOrder.get(box) - 1);
        }
        System.out.println("----------------------------------");
        System.out.println("          Total " + total + " Baht");
        System.out.println("----------------------------------");
        System.out.println("");
        newOrder.clear();
    }

    // Add new menu and price from user

    public static void addnewMenu() {
        Scanner inputMenu = new Scanner(System.in);
        Scanner inputPrice = new Scanner(System.in);
        String exit = "EXIT";
        System.out.println("**Enter \"exit\" to confirm**");
        for (int trigger = 0; trigger < 1;) {
            System.out.print("Enter new menu : ");
            String menu = inputMenu.nextLine();
            if (menu.toUpperCase().equals(exit)) {
                System.out.println("");
                trigger++;
            } else {
                System.out.print("Enter price : ");
                int price = inputPrice.nextInt();
                priceLen = Integer.toString(price).length();
                newPrice.add(price);
                menu = menu + spaceBar(menu.length());
                newMenu.add(menu);
            }
        }
    }

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
        } else {
            for (int LENGTH = length; LENGTH < 22; LENGTH++) {
                space = space + newSpace;
            }
        }
        return space;
    }
}