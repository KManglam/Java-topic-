public class parent{

    public void x(){
        System.out.println("This is x");
    }
}
class Son extends Parent{
    public void x(){
        System.out.println("This is son class");
    }

    public static void main(String[] args) {
        Son obj=new Son();
        obj.x();
    }

}
