class Parent{
    int c=4;
    int b=5;
    public int add(int b, int c){
        this.b = 7;
        this.c = 5;
        return b+c;
    }
}

class Child extends Parent{
    static int a=10;
    public static void main (String []X){
        int a=50;
        Child obj = new Child();
      //  int x = obj.add;
     //   System.out.println(obj.add);

    }
}

