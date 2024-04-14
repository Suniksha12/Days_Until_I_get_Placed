/* The approach is simple yet optimized. 
 - The idea is to reverse the array three times.
 - For the first time we reverse only the last k elements.
 - Second time we will reverse first n-k(n=size of array) elements. 
 - Finally we will get our rotated array by reversing the entire array. */


//Time complexity : O(N)
//Space Complexity : O(1)

import java.io.*;

public class approach_2 {
    public static void main(String[] args) {
        int arr[] = new int[] {1,3,5,7,9,11};
        int n = arr.length;
        int k = 3;
        k = k % n;
        int i, j;
        
        // reversing last K numbers
        for(i = n-k,j=n-1;i<j;i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        // reversing the first n-k terms
        for(i =0,j = n-k-1;i<j;i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        //reverse the entire array
        for(i = 0,j = n-1;i<j;i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        //print the rotated array
        for(int t = 0;t <n;t++) {
            System.out.print(arr[t] + " ");
        }
    }
}
