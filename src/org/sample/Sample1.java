package org.sample;

import java.util.Arrays;


public class Sample1

{
    public static void main(String[] args) 
    {
        int[] arr = {1,2,4,8,5,16,9,7};
        double[] sqrt = new double[arr.length];
        
        //Iterating each element of the array
        for (int i = 0; i < arr.length; i++) 
        {
            //find square root of each element using Math.sqrt() function
            sqrt[i] = Math.sqrt(arr[i]);
        }
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Array after finding the square of the elements: " + Arrays.toString(sqrt));
    }
}