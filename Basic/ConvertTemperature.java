import java.util.*;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("            Convert Temperatures            ");
        System.out.println("   (Celsius, Fahrenheit, Kelvin, Reaumur)   ");
        System.out.println("--------------------------------------------");
        System.out.println("      [1] Convert Celsius to others         ");
        System.out.println("      [2] Convert Fahrenheit to others      ");
        System.out.println("      [3] Convert Kelvin to others          ");
        System.out.println("      [4] Convert Reaumur to others         ");
        System.out.println("--------------------------------------------");
        System.out.print("Enter mode : ");
        int mode = input.nextInt();
        if (mode == 1) {
            System.out.print("Enter Celsius temperature : ");
            float c = input.nextFloat();
            System.out.println(c + " Celsius = " + ((c * 1.8) + 32) + " Fahrenheit");
            System.out.println(c + " Celsius = " + (c + 273.15) + " Kelvin");
            System.out.println(c + " Celsius = " + (c * 0.8) + " Reaumur");
        } else if (mode == 2) {
            System.out.print("Enter Fahrenheit temperature : ");
            float f = input.nextFloat();
            System.out.println(f + " Fahrenheit = " + ((f - 32) * 5 / 9) + " Celsius");
            System.out.println(f + " Fahrenheit = " + ((f + 459.67) * 5 / 9) +" Kelvin");
            System.out.println(f + " Fahrenheit = " + ((f - 32) * 4 / 9) +" Reaumur");
        } else if (mode == 3) {
            System.out.print("Enter Kelvin temperature : ");
            float k = input.nextFloat();
            System.out.println(k + " Kelvin = " + (k - 273.15) +" Celsius");
            System.out.println(k + " Kelvin = " + ((k * 1.8) - 459.67) +" Fahrenheit");
            System.out.println(k + " Kelvin = " + ((k - 273.15) * 0.8)+" Reaumur");
        } else {
            System.out.print("Enter Reaumur temperature : ");
            float r = input.nextFloat();
            System.out.println(r + " Reaumur = " + (r * 1.25) +" Celsius");
            System.out.println(r + " Reaumur = " + ((r * 2.25) + 32) +" Fahrenheit");
            System.out.println(r + " Reaumur = " + ((r * 1.25) + 273.15) +" Kelvin");
        }
    }
}
