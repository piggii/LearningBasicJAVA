import java.util.*;

public class BasicIfElse_BMI {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("******************************");
        System.out.println("        BMI Calculator        ");
        System.out.println("******************************");
        System.out.print("Enter your weight [kg] : ");
        float weight = input.nextFloat();
        System.out.print("Enter your height [cm] : ");
        float height = input.nextFloat();
        height = height / 100;
        double bmi = weight / (Math.pow(height, 2));
        System.out.println("BMI = " + bmi);
        if(bmi < 18.5) {
            System.out.println("Result : Underweight");
        } else if(bmi <= 24.9) {
            System.out.println("Result : Normal Range");
        } else if(bmi <= 29.9) {
            System.out.println("Result : Overweight");
        } else {
            System.out.println("Result : Obesity");
        }
        System.out.println("******************************");
    }
}
