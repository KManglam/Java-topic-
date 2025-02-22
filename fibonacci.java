

import java.util.Scanner;
public class fibonacci {
        
        public static void main(String[] args) {
            int n,t1,t2,nextterm ,i;
            System.out.print("Enter the number of terms: ");
            Scanner obj= new Scanner(System.in);
            n=obj.nextInt();
            t1=0;
            t2=1;
            System.out.print("Fibonacci Series: "+t1+" "+t2);
            for(i=3;i<=n;i++){
                nextterm=t1+t2;
                System.out.print(" "+ nextterm);
                t1=t2;
                t2 = nextterm;
            }
        }
}
