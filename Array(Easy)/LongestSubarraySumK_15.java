// public class LongestSubarraySumK_15 {
//         public static int longestSubarray(int[] arr, int k) {
//             int maxLength = 0;
//             for (int i = 0; i < arr.length; i++) {
//                 int sum = 0;
//                 for (int j = i; j < arr.length; j++) {
//                     sum += arr[j];
//                     if (sum == k) {
//                         maxLength = Math.max(maxLength, j - i + 1);
//                     }
//                 }
//             }
//             return maxLength;
//         }

//         public static void main(String[] args) {
//             int[] arr = { 1, 2, 3, 1, 1, 1, 1 };
//             int k = 3;
//             System.out.println(longestSubarray(arr, k));
//         }
// }



//Better Approach
import java.util.*;
public class LongestSubarraySumK_15 {
    public static int longestSubarrayWithSumK(int[] arr, long k) {

        HashMap<Long, Integer> preSumMap = new HashMap<>();

        long sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            long rem = sum - k;

            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 1, 1, 1 };
        int k = 3;
        System.out.println(longestSubarrayWithSumK(arr, k));
    }
}