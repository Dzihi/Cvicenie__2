package fei.stuba.uim.oop;
import java.util.Arrays;
import java.util.Scanner;
class Main {

    public static void main(String[] args) {

        int[] intArray = new int[]{3, 8, 3, 4, 5};

        Scanner myObj = new Scanner(System.in);
        System.out.println("Zadaj pole cisiel");

        String intString = myObj.nextLine();
        System.out.println("Zadane pole cisiel : " + intString);

        System.out.println("Int array : "  + Arrays.toString(intArray));

        System.out.println("Sortnuta array" + Arrays.toString(Sort(intArray)));

    }

    public static int[] Sort(int[] intArray){
        Arrays.sort(intArray);
        return(intArray);

    }

}




