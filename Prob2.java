import java.util.Scanner;
public class Prob2 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = input.nextInt();
        System.out.println("Enter the second number: ");
        int b = input.nextInt();
        int c = a + b;
        System.out.println("Sum of two numbers is: " + c);
    }
}
