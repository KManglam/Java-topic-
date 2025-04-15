
import java.io.*;

public class filewriter {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("C:\\Users\\hp\\Desktop\\abc2.txt");
            try{
                f.write("hhhhhhhhhhhhhhhhhh");
            }
            finally{
                f.close();
            }
            System.out.println("Successfully data wrote in file");
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
