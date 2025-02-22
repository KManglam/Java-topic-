

public class trycatch {
    public static void main(String[] args) {
        try{
            int result=10/0;
        }
        catch (ArithmeticException a){
            System.out.println("Caught Exception: "+ a.getMessage());
        }
        System.out.println(("llllllll"));

    }
}
