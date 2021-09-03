package collection;

import java.util.HashMap;

public class HashMapDemo {
    public void demo(){

        // SYNTAX: Hashmap<DataType_key, Datatype_Value> Object_name= new HashMap();

        HashMap<Integer,String> hashmap= new HashMap<>();

        // adding element
        hashmap.put(1,"Ram");
        hashmap.put(2,"laxman");
        hashmap.put(3,"Ravan");
        hashmap.put(4,"Ramayan");

        // get Element
        System.out.println(hashmap.get(1));
        System.out.println(hashmap.get(2));
        System.out.println(hashmap.get(3));
        System.out.println(hashmap.get(4));

        // Adding element
        HashMap<String,String> stringhashmap= new HashMap<>();
        stringhashmap.put("U.P","Lucknow");
        stringhashmap.put("M.P","Bhopal");
        stringhashmap.put("J&K","Srinagar");

        // remove element
        stringhashmap.remove("U.P");

        // get method
        System.out.println(stringhashmap.get("U.P"));
        System.out.println(stringhashmap.get("M.P"));
        System.out.println(stringhashmap.get("J&K"));

    }

    public static void main(String[] args) {
        HashMapDemo obj= new HashMapDemo();
        obj.demo();
    }
}
