package arrays;

import javax.imageio.stream.ImageInputStream;

public class DemoArray {
    public void demo(){
        // Syntax of array: Data type [] variable_name= {,,,,,,,}

        String [] nameArray= {"john","java","ram","lakshman"};

        for (int i=0; i<nameArray.length; i++){

            System.out.println("printing array : "  +nameArray[i]+ "printing index i :" +i);
        }
        // Advance for loop
        // Syntax : for(Data type var : ArrayName)

        for (String var: nameArray){
            System.out.println("inside advance loop"+var);
        }

        int[] marksArray= {654,645,324,897,};

        for (int var: marksArray){

            System.out.println("inside marks advance array list"+var);
        }
        double[] priceArray= {765.76,763.56,987.56};
        for (double var: priceArray){
            System.out.println("inside price advance array list"+ var);
        }
    }

    public static void main(String[] args) {
        DemoArray obj= new DemoArray();
        obj.demo();
    }
}
