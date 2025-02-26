import java.util.Scanner;


public class A1Q1{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n;
        n = obj.nextInt();
        double sum = 0.0;
        for (int i=1;i<=n;i++){
            sum+=1.0/i;
        }
        System.out.println("The Sum of Harmonic Series: " + sum);


    }
}
