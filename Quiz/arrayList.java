import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        Scanner inputMenu = new Scanner(System.in);
        Scanner inputPrice = new Scanner(System.in);
        String exit = "EXIT";
        ArrayList<String> myMenu = new ArrayList<String>();
        ArrayList<Integer> myPrice = new ArrayList<Integer>();
        for (;;) {
            System.out.print("Enter new menu : ");
            String Menu = inputMenu.nextLine();
            if (Menu.toUpperCase().equals(exit)) { 
                System.out.println("----------------------------------");
                System.out.println("               MENU               ");
                System.out.println("----------------------------------");
                for (int i = 0; i < myMenu.size(); i++) {
                    System.out.println(i + 1 + ". " + myMenu.get(i) + myPrice.get(i)+" Baht");
                }
                System.out.println("----------------------------------");
                break;
            }
            Menu = Menu + spaceBar(Menu.length());
            myMenu.add(Menu);
            System.out.print("Enter price : ");
            int price = inputPrice.nextInt();
            myPrice.add(price);
        }
    }
    public static String spaceBar(int i) {
        String space ="";
        for(int j = i ; j < 24; j++){
            String newSpace = " ";
            space = space + newSpace;
        }
        return space;
    }
}
