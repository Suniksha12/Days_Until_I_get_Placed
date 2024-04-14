/* - “rotateArray” function will take an array “arr” ,  it’s size is “n”  and the number of rotations “k” as an input.
   - To reduce the number of rotations, we compute ‘k’ modulo ‘n’ ( k%=n) .
   - Using the STL library’s “reverse” function, reverse the first portion of the array from the start up to the “n – k” index.
   - Using the “reverse” function from the STL library, reverse the second part of the array from the “n – k” index to the end.
   - To get the rotated array, reverse the entire array using the “reverse” function in the STL library.
   - Then ,we’ll return the rotated array. */

//Time complexity : O(n)
//Space Complexity : O(1)

public class approach_3 {
    static void rotateArray(int[] arr,int n, int k) {
        if(k == 0) {
            return;
        }
        
        //rotate the array to the right by one position
        int temp = arr[n-1];
        for(int i = n-1;i>0;i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;

        //Recursively rotate the remaining element
        rotateArray(arr, n, k-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        int n = arr.length;
        int k = 2;

        rotateArray(arr,n,k);

        //Print the Rotated array
        for(int i = 0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
