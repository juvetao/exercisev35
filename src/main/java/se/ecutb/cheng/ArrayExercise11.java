package se.ecutb.cheng;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayExercise11 {
    public static void main(String[] args) {
        // call task 11
        int[] numbers = new int[1];
        printIntArray(storeIntArray(numbers));
    }

    //print intArray
    public static void printIntArray(int[] figures){
        for(int figure : figures){
            System.out.print(figure+" ");
        }
        //System.out.print("etc.");
    }

    //task 11
    public static int [] storeIntArray(int [] source) {
        List<Integer> result = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int number;

        for(int i=0; i<result.size()+1; i++){
            System.out.println("Enter a number: ");

            number = scanner.nextInt();
            for (int j=0;j<result.size();j++){
                if(source[j] != number){
                    result.add(number);
                }else{
                    System.out.println("Existed!");
                    break;
                }
            }
        }
        int[] arrayResult = toIntArray(result);
        return arrayResult;
    }

    //change data type from List to Array
    static int[] toIntArray(List<Integer> list){
        int[] ret = new int[list.size()];
        for(int i = 0;i < ret.length;i++)
            ret[i] = list.get(i);
        return ret;
    }
}
