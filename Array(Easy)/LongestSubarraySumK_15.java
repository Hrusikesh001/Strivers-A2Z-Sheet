public class LongestSubarraySumK_15 {
        public static int longestSubarray(int[] arr, int k) {
            int maxLength = 0;
            for (int i = 0; i < arr.length; i++) {
                int sum = 0;
                for (int j = i; j < arr.length; j++) {
                    sum += arr[j];
                    if (sum == k) {
                        maxLength = Math.max(maxLength, j - i + 1);
                    }
                }
            }
            return maxLength;
        }

        public static void main(String[] args) {
            int[] arr = { 1, 2, 3, 1, 1, 1, 1 };
            int k = 3;
            System.out.println(longestSubarray(arr, k));
        }
}
