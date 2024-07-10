import java.util.*;

public class SumOfValueInRange {

    // Function to calculate prefix sums
    public static void prefixSum(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
    }
    public static int sumOfRange(int[] arr, int l, int r) {
        //SINCE ARRAY FOLLOWS 0 BASED INDEXING
       return arr[r]-arr[l-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("GIVE THE SIZE OF THE ARRAY");
        int q = sc.nextInt();

        // Add an extra element for 1-based indexing compatibility
        int[] arr = new int[q + 1];

        System.out.println("Enter the elements of the array");
        for (int i = 1; i <= q; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate prefix sums
        prefixSum(arr);

        // For example, finding sum from 2 to 5
        System.out.println(sumOfRange(arr, 2, 5));

        sc.close();
    }
}
