public class subsequences_of_array_12 {
    public void printSubsequences(int[] arr, int index, String current) {
        if (index == arr.length) {
            System.out.println(current);
            return;
        }
        // Include the current element
        printSubsequences(arr, index + 1, current + arr[index] + " ");
        // Exclude the current element
        printSubsequences(arr, index + 1, current);
    }

    public static void main(String[] args) {
        subsequences_of_array_12 obj = new subsequences_of_array_12();
        int[] arr = {1, 2, 3}; // Change this array to compute subsequences of a different array
        System.out.println("Subsequences of the array:");
        obj.printSubsequences(arr, 0, "");
    }
}


// import java.util.ArrayList;

// public class subsequences_of_array_12 {
//     static void printSubsequences(int ind, ArrayList<Integer> ds, int[] arr, int n) {

//         // Base case
//         if (ind == n) {
//             for (int it : ds) {
//                 System.out.print(it + " ");
//             }
//             System.out.println();
//             return;
//         }

//         // Take the current element
//         ds.add(arr[ind]);
//         printSubsequences(ind + 1, ds, arr, n);

//         // Remove the current element (backtracking)
//         ds.remove(ds.size() - 1);

//         // Do not take the current element
//         printSubsequences(ind + 1, ds, arr, n);
//     }

//     public static void main(String[] args) {

//         int[] arr = { 3, 1, 2 };
//         int n = arr.length;

//         ArrayList<Integer> ds = new ArrayList<>();

//         printSubsequences(0, ds, arr, n);
//     }
// }
