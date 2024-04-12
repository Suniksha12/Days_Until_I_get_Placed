import java.util.*;

class ArraysDS
{ 
    public void reversearray(int[]arr)
    { 
        System.out.println("enter the elements in your array");
        for(int i = arr.length-1;i>=0;i--) {
            System.out.print(arr[i]);
      }
   }
}
//hacker rank problem Arrays-DS (beginner , unsolved , Arrays)

class Result {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
    // Collections.reverse is the built in function for 
    Collections.reverse(a);
     return a;

    }

}