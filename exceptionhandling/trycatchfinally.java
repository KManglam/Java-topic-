public class trycatchfinally {
    public static void main(String[] args) {
        try{
            int a=200/0;
        }
        catch(ArithmeticException b){
            System.out.println("Exception found: "+ b);
        }
        finally{
            System.out.println("aaaaa");
        }
        System.out.println("ppppp");
    }
}
