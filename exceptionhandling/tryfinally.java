public class tryfinally {
    public static void main(String[] args) {
        try{
            int result =5/0;}
        finally{
            System.out.println("Finally block Execute");
        }
        System.out.println("llllllll");    // not execute
    }
}
