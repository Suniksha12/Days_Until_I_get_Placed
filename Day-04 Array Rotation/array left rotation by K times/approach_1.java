/* - We will first take the mod of K by N (K = K % N) because, after every N rotation, the array will become the same as the initial array. 
   - Now, we will iterate the array from i = 0 to i = N-1 and check, 
   - If i < K, Print the rightmost Kth element (a[N + i -K]). 
   - Otherwise, Print the array after ‘K’ elements (a[i – K]).  */


//Time complexity : O(n)
//Space Complexity : O(1)

import java.util.*;
import java.lang.*;
import java.io.*;

public class approach_1 {
    static void RightRotate(int a[],int n , int k) {
        k = k % n;
        for(int i = 0;i<n;i++) {
            if(i<k) {
                System.out.print(a[n + i - k] + " ");
            } else {
                System.out.print(a[i - k] + " ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]) {
           int Array[] = {1,2,3,4,5};
           int N = Array.length;
           int K = 2;
           RightRotate(Array,N,K);
    }
}
