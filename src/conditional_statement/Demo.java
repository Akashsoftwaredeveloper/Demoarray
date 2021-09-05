package conditional_statement;

public class Demo {

    /* if (condition) {
                     //code
        }
        else{
             //code
             }*/

    public static void main(String[] args) {

        int age= 15;

        if (age>16){
            System.out.println("This person is young");
        }else
            {
            System.out.println("This person is child");
        }

        double price= 225.24;
        if (price>225){
            System.out.println("This is valid price");
        }
        else{
            System.out.println("this is not valid price");
        }
        String place="delhi";
        if (place=="Pune"){
            System.out.println("I live in pune");
        }else{
            System.out.println("I live in delhi");

        }

    }
}
