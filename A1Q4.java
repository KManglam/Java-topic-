import java.util.Scanner;
public class A1Q4 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("------ To Determine the Salvage value of an Item ------ ");
        int Depreciation,purchase_price,Salvage_value,years_of_service;
        System.out.print("Enter the Annual Depreciation of an item : ");
        Depreciation=ss.nextInt();
        System.out.print("Enter Purchase price: ");
        purchase_price=ss.nextInt();
        System.out.print("Now enter the Years of Service: ");
        years_of_service=ss.nextInt();
        Salvage_value=purchase_price-(Depreciation*years_of_service);
        System.out.println("Salvage value of an Item is : " + Salvage_value );

    }

}
