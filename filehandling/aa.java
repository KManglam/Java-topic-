
import java.io.FileReader;
import java.io.IOException;

public class readfile {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("C:\\Users\\hp\\Desktop\\abc2.txt");
            try{
                int i;
                while((i=f.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                f.close();
            }

        }
        catch (IOException e){
            System.out.println("Exception Handled: "+ e);
        }
    }


}
