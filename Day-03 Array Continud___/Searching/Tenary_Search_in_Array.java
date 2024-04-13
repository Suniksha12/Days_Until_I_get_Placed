package Searching;
import java.util.Scanner;

// we will perfrom tenary search in which we will take input from the User.

//Time Complexity : O(log3 N)
//Space Complexity : O(1)

// example:

//Enter the number of elements:
//10
//Enter the elements in ascending order:
//2
//3
//4
//5
//6
//8
//19
//20
//22
//45
//Enter the element to search:
//19
//Element found at index: 6


public class Tenary_Search_in_Array {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of elements:");
            int n = scanner.nextInt();
            int[] array = new int[n];

            System.out.println("Enter the elements in ascending order:");
            for(int i =0;i<n;i++) {
                array[i] = scanner.nextInt();
            }
            System.out.println("Enter the element to search:");
            int x = scanner.nextInt();
            int result = ternarySearch(0,n-1,x,array);  
            if(result == -1) {
                System.out.println("Element not found");
            } else {
                System.out.println("Element found at index: " + result);
            }
        }
    }
    public static int ternarySearch(int l,int r ,int key,int[] arr) {
        if(r >= 1) {
            int mid1 = l + (r - l)/3;
            int mid2 = r - (r - l)/3;
            if(arr[mid1] == key) {
                return mid1;
            }
            if(arr[mid2]== key) {
                return mid2;
            }
            if(key < arr[mid1]) {
               return ternarySearch(l, mid1-1, key, arr);
            } else if(key > arr[mid2]) {
                return ternarySearch(mid2 + 1, r, key, arr);
            } else {
                return ternarySearch(mid1 + 1, mid2 + 1, key, arr);
            }
        }
        return -1;
    }
}
