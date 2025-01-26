
import java.io.*;

public class fileread {
    public static void main(String[] args) throws IOException {
            FileReader f = new FileReader("C:\\Users\\hp\\Desktop\\abc2.txt");

            int i;
            while ((i = f.read()) != -1) {
                System.out.print((char) i);
            }

    }


}
