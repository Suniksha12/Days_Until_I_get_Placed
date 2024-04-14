/* Steps involved in this array is (Using temp array)
 * - Initialize a temporary array(temp[n]) of length same as the original array
   - Initialize an integer(k) to keep a track of the current index
   - Store the elements from the position d to n-1 in the temporary array
   - Now, store 0 to d-1 elements of the original array in the temporary array
   - Lastly, copy back the temporary array to the original array
 */


 // Time complexity : O(n)
 // space Complexity - O(n)
 
import java.io.*;
import java.util.*;
public class Approach_1 {
    static void Rotate(int arr[], int d , int n) {
        d = d%n;
        int temp[] = new int[n];
        int k =0;
        for(int i =d;i<n;i++) {
            temp[k] = arr[i];
            k++;
        }
        for(int i =0;i<d;i++) {
            temp[k] = arr[i];
            k++;
        }
        for(int i = 0;i<n;i++) {
            arr[i] =temp[i];
        }
    }
    static void printArray(int arr[], int n) {
        for(int i =0;i<n;i++) {
            System.out.println(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Eneter a number:");
        int N = in.nextInt();
        int[] arr = new int[7];
        N = arr.length;
        int d = 2;
        for(int i =0;i<N;i++) {
            arr[i] = in.nextInt();
        }
        Rotate(arr,d,N);
        printArray(arr, N);
    }
}
