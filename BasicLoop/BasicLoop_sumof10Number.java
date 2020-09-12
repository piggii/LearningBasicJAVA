public class BasicLoop_sumof10Number {
    public static void main(String[] args) {
        System.out.println("--------------------------------------");
        System.out.println("           Sum of 10 number           ");
        System.out.println("--------------------------------------");
        int sum = 0;
        for (int i = 1; i < 11; i++){
            sum = sum + i;
        }
        System.out.println("       1+2+3+4+5+6+7+8+9+10 = "+sum);
        System.out.println("--------------------------------------");
    }
}
