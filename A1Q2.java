
import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args) {
        System.out.print("Enter the Price of an Item: ");
        Scanner in=new Scanner(System.in);
        float Price, Paise;
        Price = in.nextFloat();
        Paise = Price*100;
        // type conversion
        //int x = (int)Paise;
        System.out.println("Price of an Item in Paise: " + (int)Paise);

    }
}
