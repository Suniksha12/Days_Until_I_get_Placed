package Searching;

import java.util.Scanner;

// we will perform the binary serach in which we will take the no of elements as input from the user ,
// then it will ask element to be searched from the user and thus performing binary serach

//Time complexity = O(log n)
//Space complexity = O(1)

//Example:

public class Binary_Search_in_Array {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the number of elements:");
            int n = in.nextInt();
            int[] array = new int[n];

            //for performing Binary serach the array should be in sorted order

            System.out.println("Enter the elements in ascending order:");

            for(int i =0;i<n;i++) {
                array[i] = in.nextInt();
            }
            System.out.println("Enter the element to search:");
            int x = in.nextInt();

            int result = binarySearch(array,x);
            if(result == -1) {
                System.out.println("Element not found");
            } else {
                System.out.println("Element found at index: " + result);
            }
        }
    }
    public static int binarySearch(int[] array,int x) {
        int left = 0, right = array.length - 1;
        while (left <= right) { 
            int mid = left +(right - left)/2;
            if(array[mid] == x) {
                return mid;
            }
            if(array[mid] < x) {
                left = mid + 1;
            }
            else {
                right = mid + 1;
            }
        }
        return -1;
    }
}
