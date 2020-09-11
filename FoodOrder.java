import java.util.Scanner;

public class FoodOrder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("               Menu               ");
        System.out.println("----------------------------------");
        System.out.println("1. Spicy Shrimp Soup");
        System.out.println("2. Noodle Soup");
        System.out.println("3. Papaya Salad");
        System.out.println("4. Pad Thai");
        System.out.println("5. Fried rice");
        System.out.println("----------------------------------");
        System.out.println("Enter order number");
        System.out.println("**enter \"0\" to confirm order**");
        System.out.println("Order number :");
        int sum = 0;
        for (;;) {
            int menu = input.nextInt();
            int price = SelectOrder(menu);
            sum = sum+price;
            if(price == 1) {
                sum = sum-1;
                System.out.println("----------------------------------");
                System.out.println("       Total : "+sum+" Baht       ");
                System.out.println("----------------------------------");
                break;
            }
        }
    }
    public static int SelectOrder(int MENU) {
        switch (MENU) {
            case 0:
                int Complete = 1;
                System.out.println("----------------------------------");
                System.out.println("     \"Order successfully!!\"     ");
                System.out.println("----------------------------------");
                return Complete;

            case 1:
                int SpicyShrimpSoup = 100;
                System.out.println("Spicy Shrimp Soup         100 Baht");
                return SpicyShrimpSoup;

            case 2:
                int NoodleSoup = 40;
                System.out.println("Noodle Soup                40 Baht");
                return NoodleSoup;

            case 3:
                int PapayaSalad = 35;
                System.out.println("Papaya Salad               35 Baht");
                return PapayaSalad;
                
            case 4:
                int PadThai = 50;
                System.out.println("Pad Thai                   50 Baht");
                return PadThai;

            case 5:
                int FriedRice = 35;
                System.out.println("Fried rice                 35 Baht");
                return FriedRice;

            default:
                System.out.println("******Please Enter only 0-5*******");
                return 0;
        }
    }
}

        