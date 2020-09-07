import java.util.concurrent.TimeUnit;

public class BasicLoop_printNum {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
            TimeUnit.SECONDS.sleep(1);
        }
    }
}