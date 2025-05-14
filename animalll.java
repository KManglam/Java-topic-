class Animal {
    void a() {
        System.out.println("Parent");
    }
}


class Dog extends Animal {
    void b() {
        System.out.println("Dog is an Animal.");
    }
    Dog() {
        super.a();
    }
    
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.a();
        obj.b();
    }
}

















