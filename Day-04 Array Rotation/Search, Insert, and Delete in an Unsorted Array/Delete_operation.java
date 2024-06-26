//Time Cpmplexity = O(n)
// Space Complexity = O(1)

public class Delete_operation {
    static int findElement(int arr[], int n, int key)
    {
        int i;
        for (i = 0; i < n; i++)
            if (arr[i] == key)
                return i;
 
        return -1;
    }
    static int deleteElement(int arr[], int n , int key) {
        int pos = findElement(arr, n, key);
        if(pos==-1) {
            System.out.println("Element not Found");
            return n;
        }

        int i;
        for( i = pos ; i<n-1;i++) {
            arr[i] = arr[i+1];
        
        }
        return n-1;
    }
        public static void main(String args[])
         {
            int i;
            int arr[] = {10,50,30,40,20};
            int n = arr.length;
            int key = 30;

        System.out.println("Array before deletion");
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
         
          // Function call
        n = deleteElement(arr, n, key);
 
        System.out.println("\n\nArray after deletion");
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
         
      }
      
    }
