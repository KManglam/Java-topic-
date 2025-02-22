import java.io.FileReader;
import java.io.IOException;

public class checked {
    public static void main(String[] args) {
        try{
            FileReader file=new FileReader("abc.txt");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
