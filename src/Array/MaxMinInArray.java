package Array;

import java.util.Arrays;

public class MaxMinInArray {
    public static void main(String[] args) {
        //given array
        int[] array={34,56,90,4,88,57};
        System.out.println("the given array is"+ Arrays.toString(array));
        //variable creation
        int maximum=array[0];
        int minimum=array[0];

        //for loop
        for (int i = 0; i < array.length; i++) {
            if (array[i]>maximum) {
                maximum=array[i];

            }
            if  (minimum> array[i]) {
                minimum=array[i];

            }
        }
        System.out.println("the minimum  is " + minimum );
        System.out.println("the maximum  is " + maximum );






    }
}
