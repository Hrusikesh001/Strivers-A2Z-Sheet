// public class max_subarry_sum_04 {
//     public static int maxSubarraySum(int arr[]) {
//         int n = arr.length;
//         int maxSum = Integer.MIN_VALUE;
//         for(int i = 0; i < n; i++){
//             for(int j = i; j < n; j++) {
//                 int sum = 0;
//                 for(int k = i; k <= j; k++) {
//                     sum += arr[k];
//                 }
//                 maxSum = Math.max(maxSum, sum);
//             }
//         }
//         return maxSum;
//     }
//     public static void main(String[] args) {
//         int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
//         System.out.println(maxSubarraySum(arr));
//     }
// }



//Better Approach
// public class max_subarry_sum_04 {
//     public static int maxSubarraySum(int[] arr) {
//         int n = arr.length;
//         int maxSum = Integer.MIN_VALUE;
//         for (int i = 0; i < n; i++) {
//             int sum = 0;
//             for (int j = i; j < n; j++) {
//                 sum += arr[j];
//                 maxSum = Math.max(maxSum, sum);
//             }
//         }
//         return maxSum;
//     }
//     public static void main(String[] args) {
//         int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
//         System.out.println(maxSubarraySum(arr));
//     }

// }



//Optimal Approach
public class max_subarray_sum_04 {

    public static int maxSubarraySum(int[] arr) {

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            maxSum = Math.max(maxSum, sum);

            if (sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };

        System.out.println(maxSubarraySum(arr));
    }
}