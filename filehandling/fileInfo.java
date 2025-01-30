import java.io.File;

public class fileInfo {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\hp\\Desktop\\abc2.txt");
        if(f.exists()){
            System.out.println("File Name: "+f.getName());                 //  File Name
            System.out.println("File location: "+f.getAbsolutePath());     // Path Name
            System.out.println("File Writable: "+f.canWrite());           //   T/F
            System.out.println("File Read: "+f.canRead());                // T/F
            System.out.println("File length: "+f.length());               // 14
            System.out.println("File Remove: "+f.delete());}
         else{
                System.out.println("File not Exist");
            }
      }
}
