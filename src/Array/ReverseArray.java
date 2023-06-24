package Array;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] array={12,14,17,187,34} ;
        System.out.println("the given array is"+ Arrays.toString(array));



        int store;
        int left=0;
        int right=array.length-1;
        while (right>left){
            store=array[left];
            array[left]=array[right];
            array[right]=store;
            left++;
            right--;

        }
        System.out.println("the reversed  array is"+Arrays.toString(array));


    }

//     static void reverseArray(int[] array ){
//        int store;
//        int left=0;
//        int right=array.length-1;
//        while (right>left){
//            store=array[left];
//            array[left]=array[right];
//            array[right]=store;
//            left++;
//            right--;
//
//        }
//
//
//    }
}
