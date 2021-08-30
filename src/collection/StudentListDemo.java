package collection;
import model.*;
import java.util.ArrayList;

public class StudentListDemo {

    public void demo(){

        // SYNTAX : Arraylist <Data Type> variable_name= new Arraylist <Data Type>();

        ArrayList <Student> StudentArraylist= new ArrayList<>();

        // Create student object using parametrised construction
        Student Student1=new model.Student("Raj",5,"computer science");
        StudentArraylist.add(Student1);

        Student Student2=new model.Student("john",54,"Master of arts");
        StudentArraylist.add(Student2);

        Student Student3=new model.Student("Rohit",44,"science");
        StudentArraylist.add(Student3);

        for (Student var: StudentArraylist){
            System.out.println(var.getName());
            System.out.println(var.getAge());
            System.out.println(var.getSection());
        }
    }

    public static void main(String[] args) {
        StudentListDemo obj= new StudentListDemo();
        obj.demo();
    }

}
