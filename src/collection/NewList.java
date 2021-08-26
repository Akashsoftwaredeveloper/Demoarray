package collection;

import java.util.ArrayList;
import java.util.List;

public class NewList {
    public void demo() {
        // syntax : Arraylist obj_name= new arraylist();

        List list = new ArrayList();

        list.add("Rahul");//index 0
        list.add("Radha");//index 1
        list.add("Dheeraj");//index2

        System.out.println("Printing element using get"+list.get(0));
        System.out.println("Printing element using get"+list.get(1));
        System.out.println("Printing element using get"+list.get(2));

        {// Advance for loop
            for (Object var:list){
                System.out.println(var);
            }
            //remove method
            list.remove(0);

            for (Object var: list)
            System.out.println("after deleting " +var);

        }
    }

    public static void main(String[] args) {
        NewList obj= new NewList();
        obj.demo();
    }
}