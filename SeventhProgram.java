//1. Create 4 variables of type double named dailyAvg, quizAvg, testAvg, and
//sixWeeksAvg. Initialize dailyAvg to 88, quizAvg to 74, testAvg to 95, and sixWeeksAvg
//to zero.
//2. Create another variable of type int named roundedAvg and initialize it to zero.
//3. Calculate the six weeks average using the following formula:
//sixWeeksAvg equals dailyAvg times 0.3 plus quizAvg times 0.2 plus testAvg times 0.5
//4. To round the six week's average to the nearest integer do the following:
//- add 0.5 to sixWeeksAvg
//- cast the sixWeeksAvg to an int and store the result in roundedAvg
//5. The program's output should be in the same format as the Sample Run below.
//Daily Average = 88.0
//Quiz Average = 74.0
//Test Average = 95.0
//--------------------------
//Six Weeks Average = 89
import java.util.Scanner;

public class SeventhProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double dailyAvg, quizAvg, testAvg, sixWeeksAvg;
        int roundedAvg = 0;
        System.out.println("Enter daily average : ");
        dailyAvg = input.nextDouble();
        System.out.println("Enter quiz average : ");
        quizAvg = input.nextDouble();
        System.out.println("Enter test average : ");
        testAvg = input.nextDouble();
        sixWeeksAvg = dailyAvg * 0.3 + quizAvg * 0.2 + testAvg * 0.5;
        sixWeeksAvg += 0.5;
        roundedAvg = (int)sixWeeksAvg;
        System.out.println("Daily average = " + dailyAvg);
        System.out.println("Quiz average = " + quizAvg);
        System.out.println("Test average = " + testAvg);
        System.out.println("--------------------------");
        System.out.println("Six weeks average = " + sixWeeksAvg);


    }
}
