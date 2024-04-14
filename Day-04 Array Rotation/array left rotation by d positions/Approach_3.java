//(A juggling Algorithm)
/*  - Perform d%n in order to keep the value of d within the range of the array where d is the number of times the array is rotated and N is the size of the array.
    - Calculate the GCD(N, d) to divide the array into sets.
    - Run a for loop from 0 to the value obtained from GCD.
    - Store the value of arr[i] in a temporary variable (the value of i denotes the set number).
    - Run a while loop to update the values according to the set.
    - After exiting the while loop assign the value of arr[j] as the value of the temporary variable (the value of j denotes the last element of the ith set).*/

//Time complexity : O(N) 
//Auxiliary Space : O(1)
import java.io.*;

public class Approach_3 {
    void leftRotate(int arr[],int d,int n) {
        d = d%n;
        int i , j,k,temp;
        int g_c_d = gcd(d,n);
        for(i = 0;i<g_c_d;i++) {
            temp = arr[i];
            j = i;
            while(true) {
                k=j+d;
                if(k>=n) 
                   k = k - n;
                if(k==i)   
                   break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }
    void printArray(int arr[], int size) {
        int i;
        for(i = 0;i<size;i++) {
            System.out.print(arr[i] + " ");
        }
    }
    int gcd(int a, int b) {
        if(b == 0) 
           return a;
        else
           return gcd(b,a%b);
    }
    public static void main(String[] args) {
        RotateArray rotate = new RotateArray();
        int arr[] = {1,2,3,4,5,6,7};
        rotate.leftRotate(arr, 2, 7);
        rotate.printArray(arr, 7);
    }
}
