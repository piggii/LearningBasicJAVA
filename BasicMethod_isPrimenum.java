/*This progrm is find prime numbers 1 to 500 */
public class BasicMethod_isPrimenum {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 to 500 :");
        for (int i = 1; i < 501; i++) {
            if (isPrime(i) == true) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
