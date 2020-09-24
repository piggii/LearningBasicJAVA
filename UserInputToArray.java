import java.util.*;

public class UserInputToArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String exit = "EXIT";
        System.out.println("Enter new menu : ");
        int size = 0;
        String myMenu[] = new String[size];
        for(;;) {
            String Menu = input.nextLine();
            int newSize = myMenu.length + 1;
            String newMenu[] = new String[newSize];
            System.arraycopy(myMenu,0,newMenu,0,myMenu.length);
            myMenu = newMenu;
            myMenu[myMenu.length -1] = Menu;
            if(Menu.toUpperCase().equals(exit)) {
                for(int i = 0; i < myMenu.length - 1; i++) {
                    System.out.println(i+1+". "+myMenu[i]);
                }  
                break;
            } 
        }
    }
}
