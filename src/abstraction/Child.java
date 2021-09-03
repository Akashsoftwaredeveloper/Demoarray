package abstraction;

public class Child extends AbstractionDemo {
    @Override
    public void demo() {
        System.out.println("This is override method");
    }

    @Override
    public void m2() {
        System.out.println("This is method override m2");
    }

    public static void main(String[] args) {
        Child obj= new Child();
        obj.demo();
        obj.m1();
        obj.m2();
    }
}
