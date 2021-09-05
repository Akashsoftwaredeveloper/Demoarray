package conditional_statement;

public class Different_Operator {
    // && = AND operator (a= true && b=true= true) , (a=False && b=True= False)
    // || = OR operator  (a||b a= true || b=true= true),(a||b a= true || b=false= true),
    //                   (a||b a= false || b=false= true)
    // !  = NOT operator (Shows opposite result)
    //                   !a a=true     Result==>  False
    //                   !a a=false    result==>  True

    public static void main(String[] args) {

        int age=15;
        String place="Agra";

        // && AND OPERATOT
        if (age>14 && place=="Agra"){
            System.out.println("This person is adult and live in agra");
        }else{
            System.out.println("This person is not adult and not live in agra city");
        }
        // || OR OPERATOR
        if (age>10 || place=="Delhi"){
            System.out.println("This person age is more than ten and not live in Agra");
        }else{
            System.out.println("Inside else block of OR OPERATOR");
        }
        // ! NOT OPERATOR
        if (!(age<10)){
            System.out.println("Inside if statement of OR OPERATOR");
        }else{
            System.out.println("Inside else statement of OR OPERATOR");
        }
    }
}
