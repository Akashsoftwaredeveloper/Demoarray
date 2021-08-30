package methods;

public class MethodWithReturnType{

    public String demo() {
        String name = "core java";
        return name;
    }
    public String message(String msg) {
        String output = "Hello" + msg;
        return output;
    }

    public int intnumber() {
        return 66;
    }

    public static void main(String[] args) {
        MethodWithReturnType obj = new MethodWithReturnType();
        String var= obj.demo();
        System.out.println(var);

        String result= obj.message("john akash");
        System.out.println(result);

        int result_new= obj.intnumber();
        System.out.println(result_new);
    }

}