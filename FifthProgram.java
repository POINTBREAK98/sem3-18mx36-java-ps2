//To check valid and invalid literals of all types.
public class FifthProgram {
    public static void main(String[] args) {
        System.out.println("LITERALS VALID");
        System.out.println("Integer Literals");
        int int_dec = 99;
        int int_oct = 0110;
        int int_hexa = 0xffff;
        int int_bin = 0b1111;
        System.out.println(int_dec);
        System.out.println(int_oct);
        System.out.println(int_hexa);
        System.out.println(int_bin);
        System.out.println("Floating Point Literals");
        float x = (float) 9.47;
        float y = (float) 0.99;
        float z = 0x123;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println("Character Literals");
        char c1 = 'a';
        char c2 = '\u0000'; // Unicode representation
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("\' is a symbol");// Escape character literal
        System.out.println("String literals");
        String s1 = "Hello";
        System.out.println(s1);
        System.out.println("Boolean literals");
        boolean a = true;
        boolean b = false;
        System.out.println(a);
        System.out.println(b);
        System.out.println("INVALID LITERALS");
        //float c = 0x123.222; // Hexa-decimal form Error: malformed floating point literal
        //char b = 0789; // It is an Integer literal with octal form error:Integer number too large
        //String s1 = Hello;error: cannot find symbol
        //boolean a = 0;error: incompatible types: int cannot be converted to boolean
        //boolean b = 1;error: incompatible types: int cannot be converted to boolean
    }
}
