
public class Student {

// -------static keyword---------
    // static vaiable
        static String college = "DAV";
    Student(int i,String n){

       int id = i;
       String name = n;

       System.out.println(id + " " + name +" "+college);
   }
    public static void main(String[]m) {
        Student st1 = new Student(100,"Aman");
        Student st2 = new Student(101,"Abhi");

    }

    

/* Student(int i,String n){
        int id = i;
        String name = n;
        System.out.println(id + " " + name);
    }
    public static void main(String[]m) {
        Student st1 = new Student(100,"Aman");
        Student st2 = new Student(101,"Abhi");

    }*/

}
