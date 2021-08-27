package methods;

public class Calculator {

    // Add, Sub, mult, Divide
    // syntax : access specifier Return_type method_name (parameterized) {code}

    public void addition(){

        int a= 87;
        int b= 54;
        int sum= a+b;

        System.out.println("addition of sum two value " +sum);
    }
    public void subraction(){

        int a= 87;
        int b= 54;
        int sub= a-b;

        System.out.println("subtraction of two value  "+sub);
    }
    public void mult(){

        int a= 65;
        int b= 45;
        int mult= a*b;

        System.out.println("multiplication of two value is "+mult);
    }
    public void divide(){

        int a= 44;
        int b= 2;
        int divide= a/b;

        System.out.println("division of two value  "+divide);
    }

    public static void main(String[] args) {
        Calculator object = new Calculator();
        object.addition();
        object.subraction();
        object.mult();
        object.divide();
    }
}
