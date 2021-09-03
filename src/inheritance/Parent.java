package inheritance;

public class Parent {
    // MethodOverriding: Same method but different body in child class

    // Access_specifier return_type method_name (params){body}

    public void M1(){
        System.out.println("This is M1 of parent class");
    }

    public static void main(String[] args) {
        Parent object= new Parent();
        object.M1();
    }
}
