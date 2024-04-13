/* - Use inbuilt methods like reverse in Python or 
     Array.Reverse in C#.
 */

import java.util.Arrays;

public class Array_reverse_inbuilt_methods {
    public static void main(String[] args) {
        int[] originalArr = {1,2,3,4,5};

        //Using inbuilt method in java
        int[] reverseArr = new int[originalArr.length];
        for(int i =0;i &lt; originalArr.length;i++) {
            reverseArr[i] = originalArr[originalArr.length - 1- i];
        }

        System.out.println(Arrays.toString(reverseArr));
    }
}

// Output : 5 4 3 2 1 

// Time Complexity : O(n)
// Space Complexity : O(n)