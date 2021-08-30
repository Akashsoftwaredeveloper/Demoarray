package collection;

import java.util.HashSet;

public class DemoSet {
    public void demo() {

        // Syntax: HashSet <Data Type> object_name= new HashSet();

        HashSet<String> StringHashSet = new HashSet();

        StringHashSet.add("Ajay");
        StringHashSet.add("Ajay");
        StringHashSet.add("Ajay");
        StringHashSet.add("Sandeep kumar");
        StringHashSet.add("Sandeep kumar");
        StringHashSet.add("Sandeep kumar");
        StringHashSet.add("Akash");
        StringHashSet.add("Akash");
        StringHashSet.add("Radha Rani");
        StringHashSet.add("Radha Rani");
        StringHashSet.add("Radha Rani");

        // Advance for loop Statement

        for (String var : StringHashSet) {
            System.out.println("Printing StringHashSet "+var);

        }
        HashSet <Integer> EmployeeIds= new HashSet<>();

        EmployeeIds.add(55); //0 index
        EmployeeIds.add(43); //1 index
        EmployeeIds.add(43); //2 index
        EmployeeIds.add(34); //3 index
        EmployeeIds.add(33); //4 index
        EmployeeIds.add(33); //5 index
        EmployeeIds.remove(0); //6 index
        EmployeeIds.remove(3); //7 index

        for (Integer var:EmployeeIds){
            System.out.println("Printing Employee Ids "+var);
        }
    }

    public static void main(String[] args) {
        DemoSet object= new DemoSet();
        object.demo();
    }
}