//This program evaluate the expression b^2 -4 a c

import java.util.Scanner;
public class ThirdProgram {
    public static void main(String[] args) {
        double b,a,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Value of b : ");
        b = input.nextFloat();
        System.out.println("Value of a : ");
        a = input.nextFloat();
        System.out.println("Value of c : ");
        c = input.nextFloat();
        double result = Math.pow(b,2) - 4 * a * c;
        System.out.println("Result: "+result);

    }
}
