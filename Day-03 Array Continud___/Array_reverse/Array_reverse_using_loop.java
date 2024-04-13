/* - iterate through the array using two pointers(start and end).
 * - swap elements at the start and end pointers.
 * - Move the start pointer towards the end and the end pointer towards the start until they meet or cross each other.
 */

public class Array_reverse_using_loop {
    static void reverseArray(int arr[] , int start , int end) {
        int temp;
        while(start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    //printing array
    static void printArray(int arr[] , int size) {
        for(int i =0;i<size;i++) {
            System.out.print(arr[i] + " ");
        System.out.println();
        }

    }

    public static void main(String[] args) {
        int arr[] = {1 ,2 , 3 ,4,5,6};
        printArray(arr,6);
        reverseArray(arr, 0, 5);
        System.out.print("Reversed array is \n");
        printArray(arr, 6);
    }
}

/* Output :

1 2 3 4 5 6 
Reversed array is
6 5 4 3 2 1  

*/

//Time complexity : O(n)
//Space Complexity : O(1)