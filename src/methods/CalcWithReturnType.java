package methods;

public class CalcWithReturnType {

    public int add(int a, int b){
        int result= a+b;
        return result;
    }
    public int sub(int a, int b){
        int result1= a-b;
        return result1;
    }
    public int mult(int a, int b){
        int result2= a*b;
        return result2;

    }public int divide(int a, int b){
        int result3= a/b;
        return result3;}

    public static void main(String[] args) {
        CalcWithReturnType obj = new CalcWithReturnType();
        int result= obj.add(45,55);
        System.out.println("add"+result);

        int result1= obj.sub(77,760);
        System.out.println("sub" +result1);

        int result2= obj.mult(5,6);
        System.out.println("mult"+result2);

        int result3= obj.divide(8,4);
        System.out.println("divide" +result3);
    }
}
