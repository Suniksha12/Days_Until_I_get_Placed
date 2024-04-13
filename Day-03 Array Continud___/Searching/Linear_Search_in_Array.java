package Searching;

import java.util.Scanner;

// we are performing Linear Search inw hich it will first ask the user no of elements to be input then we will input the elements of array as an input
// and then it will ask which number is to be search.

// Time complexity = O(N)
// Space Complexity = O(one)

// Example :
//Enter the number of elements:
//5
//Enter the elements:
//2 
//15 
//89
//90
//78
//Enter the element to search:
//90
//Element found at index: 3
public class Linear_Search_in_Array {
     public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the number of elements:");
            int n = in.nextInt();
            int[] array = new int[n];
            System.out.println("Enter the elements:");
            for(int i =0;i<n;i++) {
                array[i] = in.nextInt();
            }
            System.out.println("Enter the element to search:");
            int x = in.nextInt();
            int result = LinearSearch(array,x);
            if(result == -1) {
                System.out.println("Element not found");
            } else {
                System.out.println("Element found at index: " + result); 
            }
        }
     }

     public static int LinearSearch(int[] array,int x) {
        for(int i =0;i<array.length;i++) {
            if(array[i] == x) {
                return i;
            }
        }
        return -1;
     }

    
}
