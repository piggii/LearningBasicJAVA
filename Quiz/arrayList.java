import java.util.*;

public class arrayList {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String exit = "EXIT";
        ArrayList<String> myMenu = new ArrayList<String>();
        System.out.println("Enter new menu :");
        for(;;){
            String Menu = input.next();
            if(Menu.toUpperCase().equals(exit)){
                System.out.println("----------------------------------");
                System.out.println("               MENU               ");
                System.out.println("----------------------------------");
                for(int i = 0; i < myMenu.size(); i++){
                    System.out.println(i + 1 + ". " + myMenu.get(i));
                }
                System.out.println("----------------------------------");
                break;
            }
            myMenu.add(Menu);
        }
    }
}
