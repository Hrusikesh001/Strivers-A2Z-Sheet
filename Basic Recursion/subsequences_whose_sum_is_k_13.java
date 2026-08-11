public class subsequences_whose_sum_is_k_13 {
    public void printSubsequences(int[] arr, int index, String current, int sum, int k) {
        if (index == arr.length) {
            if (sum == k) {
                System.out.println(current);
            }
            return;
        }
        // Include the current element
        printSubsequences(arr, index + 1, current + arr[index] + " ", sum + arr[index], k);
        // Exclude the current element
        printSubsequences(arr, index + 1, current, sum, k);
    }

    public static void main(String[] args) {
        subsequences_whose_sum_is_k_13 obj = new subsequences_whose_sum_is_k_13();
        int[] arr = {1, 2, 3}; // Change this array to compute subsequences of a different array
        int k = 3; // Change this value to find subsequences whose sum is equal to a different value
        System.out.println("Subsequences of the array whose sum is " + k + ":");
        obj.printSubsequences(arr, 0, "", 0, k);
    }
}


// import java.util.*;

// public class SubsequenceSum {

//     static void printS(int ind, ArrayList<Integer> ds, int s, int sum, int[] arr, int n) {

//         // Base case
//         if (ind == n) {
//             if (s == sum) {
//                 for (int it : ds) {
//                     System.out.print(it + " ");
//                 }
//                 System.out.println();
//             }
//             return;
//         }

//         // Take the element
//         ds.add(arr[ind]);
//         s += arr[ind];

//         printS(ind + 1, ds, s, sum, arr, n);

//         // Backtrack
//         s -= arr[ind];
//         ds.remove(ds.size() - 1);

//         // Not take the element
//         printS(ind + 1, ds, s, sum, arr, n);
//     }

//     public static void main(String[] args) {

//         int[] arr = { 1, 2, 1 };
//         int n = arr.length;
//         int sum = 2;

//         ArrayList<Integer> ds = new ArrayList<>();

//         printS(0, ds, 0, sum, arr, n);
//     }
// }