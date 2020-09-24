import java.util.*;

public class UserInputToArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = 0;
        String exit = "EXIT";
        System.out.println("Enter new menu : ");
        for(;;){
            String myMenu[] = new String[size];
            String Menu = input.nextLine();
            int newSize = myMenu.length + 1;
            String newMenu[] = new String[newSize];
            System.arraycopy(myMenu,0,newMenu,0,myMenu.length);
            myMenu = newMenu;
            myMenu[myMenu.length -1 ] = Menu;
            if(Menu.toUpperCase().equals(exit)){
                break;
            }
            for(int i = 0; i < myMenu.length; i++){
                System.out.println(myMenu[i]);
            }
           
        }
    }
}
