public class constload {

    constload(int a,int b){ System.out.println(a+b); }
    constload(int a, int b, int c){ System.out.println(a+b+c); }
    constload(double a,double b){ System.out.println("a+b"); }

        public static void main(String[] args) {
            constload obj = new constload(5,4);
            constload obj1 = new constload(4,4,4);

        }
    }

