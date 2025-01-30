import java.io.*;
public class  createfile {
    public static void main(String[] args) throws IOException {
        File f=new File("C:\\Users\\hp\\Desktop\\abc2.txt");
        if(f.createNewFile()){
            System.out.println("File Created...");}
        else{
            System.out.println("File Already Exist...");
        }
    }
}

