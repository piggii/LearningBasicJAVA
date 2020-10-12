import java.util.Scanner;

public class TestMenu {

    public static void main(String[] args) {
        System.out.println("**********************************");
        System.out.println("               Menu               ");
        System.out.println("**********************************");
        System.out.println("1. Fried rice with pork");
        System.out.println("2. Thai basil chicken");
        System.out.println("3. Thai basil pork");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter order number (enter \"0\" to complete order)");
        System.out.println("Order number :");
        int sum = 0;
        for (;;) {
            int menu = input.nextInt();
            int price = ORDER(menu);
            sum = sum+price;
            if(price == 0){
            System.out.println("Total : "+sum+" Baht");
            break;
            }
        }
    }
    private static int ORDER(int MENU){
        int FR;
        int TBC;
        int TBP;
        int stop = 0;
        switch (MENU) {
            case 0:
                System.out.println("Complete ordered!!");
                return stop;

            case 1:
                FR = 30;
                //MENU = 30;
                System.out.println("Fried rice with pork    30 baht");
                return FR;

            case 2:
                TBC = 35;
                MENU = TBC;
                System.out.println("Thai basil chicken      35 baht");
                return MENU;

            case 3:
                TBP = 35;
                MENU = TBP;
                System.out.println("Thai basil pork         35 baht");
                return MENU;
            default:
                System.out.println("Please Enter only 0-3");
        }
        return MENU;
    }
}