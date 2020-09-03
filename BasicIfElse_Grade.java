
/*This program is calculate average of exam score 
,and show grade of a student*/
import java.util.*;

public class BasicIfElse_Grade {
    public static void main(String[] args) {
        float score;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter quiz score : ");
        float inputQuiz = input.nextFloat(); // Get quiz score
        System.out.print("Enter mid-term score : ");
        float inputMidterm = input.nextFloat(); // Get mid-term score
        System.out.print("Enter final score : ");
        float inputFinal = input.nextFloat(); // Get final score
        input.close();
        score = (inputQuiz + inputMidterm + inputFinal) / 3; // Calculate the average of scores
        System.out.println("Score = " + score); // Show average of score
        if (score >= 80) {
            System.out.println("Result : A");
        } else if (score >= 75) {
            System.out.println("Result : B+");
        } else if (score >= 70) {
            System.out.println("Result : B");
        } else if (score >= 65) {
            System.out.println("Result : C+");
        } else if (score >= 60) {
            System.out.println("Result : C");
        } else if (score >= 55) {
            System.out.println("Result : D+");
        } else if (score >= 50) {
            System.out.println("Result : D");
        } else {
            System.out.println("Result : F");
        }

    }
}
