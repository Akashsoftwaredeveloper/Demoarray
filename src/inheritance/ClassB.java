package inheritance;

public class ClassB {
    public void M1 (){
        System.out.println("This is M1 method");
    }
    public void M2(){
        System.out.println("This is M2 method");
    }
    public void M3(){
        System.out.println("this is M3 Method");
    }
    public void M4(){
        System.out.println("This is M4 method ");
    }


    public static void main(String[] args) {
        ClassB object= new ClassB();
        object.M1();
        object.M2();
        object.M3();
        object.M4();

    }
}
