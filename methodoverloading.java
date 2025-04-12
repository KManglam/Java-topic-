class methodoverloading {
    int add(int a,int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }
    public static void main(String[] args) {
        methodoverloading obj = new methodoverloading();
        System.out.println("Add: "+ obj.add(5,3));
        System.out.println("Add: "+ obj.add(5,1,3));
        System.out.println("Add: "+ obj.add(7.5,7.5));
    }
}
