import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] a) {
        System.out.print("Enter the Temperature in Fahrenheit: ");
        Scanner in = new Scanner(System.in);
        double f,c;
        f = in.nextFloat();
        c = (f-32)/1.8;
        System.out.println("Temperature in Celsius: " + c );


    }
}
