package collection;

import model.Student;

import java.util.HashMap;

public class StudentHashmap {

    public void demo(){

        // SYNTAX: HashMap <Datatype_Key,Datatype_Value> object name= new HashMap<>();

        HashMap<Integer, Student>  StudentHashmap= new HashMap<>();

        Student Student1= new Student("Mohan",23,"it");
        Student Student2= new Student("Rajat",32,"Bsc");
        Student Student3= new Student("rahul",21,"Ba");
        Student Student4= new Student("Ramesh",13,"sc");
        Student Student5= new Student("Rahul",64,"Msc");

        // Adding Element put method
        StudentHashmap.put(1,Student1);
        StudentHashmap.put(2,Student2);
        StudentHashmap.put(3,Student3);
        StudentHashmap.put(4,Student4);
        StudentHashmap.put(5,Student5);

        // get method
        Student Student= StudentHashmap.get(1);

        System.out.println(Student.getName());
        System.out.println(Student.getAge());
        System.out.println(Student.getSection());

        Student= StudentHashmap.get(2);
        System.out.println(Student.getName());
        System.out.println(Student.getAge());
        System.out.println(Student.getSection());

        Student= StudentHashmap.get(3);
        System.out.println(Student.getName());
        System.out.println(Student.getAge());
        System.out.println(Student.getSection());

        Student= StudentHashmap.get(4);
        System.out.println(Student.getName());
        System.out.println(Student.getAge());
        System.out.println(Student.getSection());

        Student= StudentHashmap.get(5);
        System.out.println(Student.getName());
        System.out.println(Student.getAge());
        System.out.println(Student.getSection());

    }

    public static void main(String[] args) {
        StudentHashmap obj= new StudentHashmap();
        obj.demo();
    }
}
