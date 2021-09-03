package inheritance;

public class Child extends Parent {
    // MethodOverriding: Same method but different body in child class

    // SYNTAX: Access_specifier return_type method_name (params){body}

    public void M1(){
        System.out.println("This is M1 method of child class");
        System.out.println("This is M1 method of child class");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.M1();
        Parent object =new Child();
        object.M1();

    }


}
