/* -  Define a recursive function that takes an array as input.
   -  Swap the first and last elements.
   -  Recursively call the function with the remaining subarray.  */

import java.io.*;

public class Array_reverse_recursion {
    
    // function to reverse 
    static void reverseArr(int arr[] , int start , int end) {
        int temp;
        if(start &gt;= end)
           return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArr(arr,start+1,end-1);
    }

    static void printArray(int[] arr, int size) {
        for(int i =0;i &lt;i++) {
            System.out.print(arr[i] + " ");
        System.out.println("");
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        printArray(arr, 6);
        reverseArr(arr, 0, 5);
        System.out.println("Reversed array is ");
        printArray(arr, 6);
    }
}

/* Output : 1 2 3 4 5 6 
            Reversed array is
            6 5 4 3 2 1     */

//Time Complexity : O(n)
//Space Complexity : O(n)