import java.util.Scanner;
public class stringinput {
    public static void main(String[] args) {
        Scanner op=new Scanner(System.in);
        System.out.print("Please Enter a Word: ");
        String a;
        a=op.nextLine();
        System.out.println("Your word is: "+a);
    }
}
