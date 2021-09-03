package inheritance;

public class MethodOverLoading {

    // Same methods with different different parameters in same class

    // access_specifier return_type method_name(parameters){body}

    public void M1(){
        System.out.println("This is M1 method without parameter");
    }
    // MethodOverload 1
    public void M1(int a){
        System.out.println("This is M1 method with int params");
    }
    // MethodOverload 2
    public void M1(String s){
        System.out.println("This is M1 method with String params");
    }
    // MethodOverload 3
    public void M1(int b,String C){
        System.out.println("This is M1 method with two params int n string");
    }

    public static void main(String[] args) {
        MethodOverLoading obj= new MethodOverLoading();
        obj.M1();
        obj.M1(22);
        obj.M1("bobby");
        obj.M1(44,"Raj");
    }
}
