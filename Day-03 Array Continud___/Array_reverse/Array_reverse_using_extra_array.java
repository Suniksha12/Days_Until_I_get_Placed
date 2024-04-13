/*  - create a new array of the same size as the original array
 *  - copy elements from the original array to the new array in reverse order.
 */


public class Array_reverse_using_extra_array {
    public static void reverseArray(int[] arr) {
        int[] reverseArr = new int[arr.length];
        int lt;
        for(int i = 0; i &lt; arr.length; i++) {
            reverseArr[i] = arr[arr.length - i -1];
        }

        System.out.print("Reversed Array: ");
        for (int i : reverseArr) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] originalArr = {1,2,3,4,5};
        reverseArray(originalArr);
    }
}

// output : 5 4 3 2 1

// Time complexity : O(n)
// Space Complexity : O(n)