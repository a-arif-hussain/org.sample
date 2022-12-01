package org.sample;

import java.util.Arrays;

//public class Practise
//
//{
//    public static void main(String[] args) 
//    {
//    	String x;
//        int[] arr = {1,2,4,8,5,16,9,7};
//        
//        String sqrtt;
//		//Iterating each element of the array
//        for (int i = 0; i < arr.length; i++) 
//        {
//            //find square root of each element using Math.sqrt() function
//            sqrtt = Integer.toString((int) Math.sqrt(arr[i]));
//            x=sqrtt;
//           String[] arrs= x.split(".", 1);
//           System.out.println("Original array: " + Arrays.toString(arrs));
//
//           
//        }
////        System.out.println("Array after finding the square of the elements: " + Arrays.toString(sqrtt));
//    }
//}



public class Practise

{
    public static void main(String[] args) 
    {
        int[] arr = {10, 3,2,4,8,5,16,9,7,64};
        double[] sqrt = new double[arr.length];
        int x;
        
        //Iterating each element of the array
        for (int i = 0; i < arr.length; i++) 
        {
            //find square root of each element using Math.sqrt() function
            sqrt[i] = Math.sqrt(arr[i]);
             x =(int) Math.sqrt(arr[i]);
            
            if(x * x == arr[i]) {
            	
                System.out.println(x);

            }
            
        }
 //     System.out.println("Original array: " + Arrays.toString(arr));
    //    System.out.println("Array after finding the square of the elements: " + Arrays.toString(sqrt));
    }
}