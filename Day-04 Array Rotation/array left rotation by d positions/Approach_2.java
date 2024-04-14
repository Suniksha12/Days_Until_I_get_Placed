/* - Rotate the array to left by one position. For that do the following:
   - Store the first element of the array in a temporary variable.
   - Shift the rest of the elements in the original array by one place.
   - Update the last index of the array with the temporary variable.
   - Repeat the above steps for the number of left rotations required. */

//Time Complexity : O(N*d)
//Space Complexity : O(1)


public class Approach_2 {
    public static void rotate(int arr[],int d , int n) {
        int p = 1;
        while(p <= d) {
            int last = arr[0];
            for(int i =0;i<n-1;i++) {
                arr[i] = arr[i+1];
            }
            arr[n-1] = last;
            p++;
        }
        for(int i =0;i < n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int N = arr.length;
        // Rotate 2 times
        int d = 2;
 
        // Function call
        rotate(arr, d, N);
    } 
}
