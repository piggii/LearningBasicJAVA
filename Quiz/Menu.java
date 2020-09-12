import java.util.*;

public class Menu {
    public static void main(String[] args) {
        System.out.println("**********************************");
        System.out.println("               Menu               ");
        System.out.println("**********************************");
        System.out.println("1. Fried rice with pork");
        System.out.println("2. Thai basil chicken");
        System.out.println("3. Thai basil pork");
        selectMenu();

    }

    public static void selectMenu() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter order (enter \"0\" to complete order)");
        System.out.println("Order number :");
        for (;;) {
            float FR,TBC,TBP;
            int menu = input.nextInt();
            switch (menu) {
                case 0:
                    System.out.print("Complete ordered!!");
                    break;

                case 1:
                    FR = 30;
                    System.out.println("Fried rice with pork    30 baht");
                    continue;

                case 2:
                    TBC = 35;
                    System.out.println("Thai basil chicken      35 baht");
                    continue;

                case 3:
                    TBP = 35;
                    System.out.println("Thai basil pork         35 baht");
                    continue;
                default:
                    System.out.println("Please Enter only 0-3");
                    continue;
            }
            
            break;
        }

    }

}
