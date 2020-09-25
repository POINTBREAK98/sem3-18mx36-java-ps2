//This program reads radius from user and display the radius of circle
import java.util.Scanner;
public class SecondProgram {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the radius of the circle : ");
        float radius = keyboard.nextFloat();
        System.out.println("Area of circle: " + Math.PI * Math.pow(radius,2) );
    }
}
