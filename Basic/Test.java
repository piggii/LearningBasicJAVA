import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); 
    // Initial array
    int size = 0;
    String myArray[] = new String[size];
    //myArray[0] = "Leo";
    //myArray[1] = "Eye";
    // Print logs
    System.out.println("Array size : " + myArray.length);
    //System.out.println("New myArray item : " + myArray[0]);
    // Input
    System.out.println("Enter name");
    String name = myObj.nextLine();

    int newSize = myArray.length + 1;
    String newArray[] = new String[newSize];
    System.arraycopy(myArray, 0, newArray, 0, myArray.length);
    myArray = newArray;
    myArray[myArray.length - 1] = name; 
    System.out.println("New myArray size : " + myArray.length);
    for (int element = 0 ; element< myArray.length; element++) {
            System.out.println(element+1+". "+myArray[element]);
        }
    }
}
