//This program reads input from user and display
import java.util.Scanner;
public class FirstProgram {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name, rollNum;
        System.out.println("Enter your name:");
        name = keyboard.nextLine();
        System.out.println("Enter your Roll number:");
        rollNum = keyboard.nextLine();
        System.out.println("Enter your semester of study:");
        int semester = keyboard.nextInt();
        System.out.println("Enter your CGPA:");
        float cgpa = keyboard.nextFloat();
        System.out.println("Details");
        System.out.println("Name :" + name);
        System.out.println("Roll number :" + rollNum);
        System.out.println("Semester :" + semester);
        System.out.println("CGPA :" + cgpa);
    }
}
