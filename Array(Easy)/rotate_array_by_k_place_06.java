//rotate to the left by k place
// public class rotate_array_by_k_place_06 {
//     public static void rotateArray(int[] arr, int k) {
//         int n = arr.length;
//         k = k % n;
//         int[] temp = new int[k];
//         for(int i=0; i<k; i++) {
//             temp[i] = arr[i];
//         }
//         for(int i=k; i<n; i++){
//             arr[i-k] = arr[i];
//         }
//         for(int i=n-k; i<n; i++){
//             arr[i] = temp[i-(n-k)];
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

//         int k = 3;

//         rotateArray(arr, k);

//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }

//optimal approach
public class rotate_array_by_k_place_06 {
    public static void rotateArray(int[] arr, int k, int n) {
        k = k % n;
        // Reverse first d elements
        reverse(arr, 0, k - 1);

        // Reverse remaining elements
        reverse(arr, k, n - 1);

        // Reverse entire array
        reverse(arr, 0, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        int k = 3;

        rotateArray(arr,k, n);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
