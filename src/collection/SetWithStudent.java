package collection;

import model.Student;

import java.util.HashSet;

public class SetWithStudent {
    public void demo(){

       // Syntax:  HashSet <Data Type> object_name= new HashSet();
        HashSet<Student> StudentHashSet= new HashSet<>();
        Student student1 =new Student("raja",15,"IT");
        Student student2 =new Student("Kanaiya",23,"Cs");
        Student student3 =new Student("Sonu",45,"Bsc");
        Student student4 =new Student("Rajesh",34,"Ba.Hons");
        Student student5 =new Student("Mahesh",34,"B.com");

        StudentHashSet.add(student1);
        StudentHashSet.add(student2);
        StudentHashSet.add(student3);
        StudentHashSet.add(student4);
        StudentHashSet.add(student5);

        for (Student var:StudentHashSet ){
            System.out.println("Printing Parametrised Student "+var.getName());
            System.out.println("Printing Parametrised Student "+var.getAge());
            System.out.println("Printing Parametrised Student "+var.getSection());
        }
    }

    public static void main(String[] args) {
        SetWithStudent obj = new SetWithStudent();
        obj.demo();
    }
}
