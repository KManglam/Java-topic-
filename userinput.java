import java.util.Scanner;
public class userinput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Who are you ? ");
        String name = input.nextLine();
        System.out.print("Hi " + name);
        System.out.println(name + " Also tell me your age:");
        int age = input.nextInt();
        System.out.println("Your age is " + age );
    }
}
