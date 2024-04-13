package Searching;
import java.util.Scanner;

// we will perfrom tenary search in which we will take input from the User.

public class Tenary_Search_in_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements in ascending order:");
        for(int i =0;i<n;i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the element to search:");
        int x = scanner.nextInt();
        int result = tenarySearch(0,n-1,x,array);  
        if(result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
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
                
            }
        }
    }
}
