package collection;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DemoListWithGenerics {
    public void demo(){
        //  SYNTAX : Arraylist <Data Type> variable_name= new Arraylist <Data Type>();
        ArrayList <String> ListNames= new ArrayList <String>();

        ListNames.add("Raghavan");
        ListNames.add("Anjali");
        ListNames.add("Prem");
        ListNames.add("Tisha");

        for (String var: ListNames ){
            System.out.println("printing names"+var);
        }
        ArrayList <Integer> integerArrayListList =new ArrayList<>();

        integerArrayListList.add(6754);
        integerArrayListList.add(543);
        integerArrayListList.add(876);
        integerArrayListList.add(4342);

        for (Integer var: integerArrayListList){
            System.out.println("Printing integerArrayListList "+var);
        }
        // double

        ArrayList <Double> DoubleArrayList = new ArrayList <Double>();

        DoubleArrayList.add(659.654);
        DoubleArrayList.add(6754.87);
        DoubleArrayList.add(7654.87);
        DoubleArrayList.add(564.76);

        for (Double var : DoubleArrayList){
            System.out.println("Printing Double Value "+var);
        }
    }

    public static void main(String[] args) {
        DemoListWithGenerics obj= new  DemoListWithGenerics();
        obj.demo();
    }
}
