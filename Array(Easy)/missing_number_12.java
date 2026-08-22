// //Bruteforce approach
// public class missing_number_12 {
//         public static int missingNumber(int[] nums) {
//             int n = nums.length;
//             for (int i = 0; i <= n; i++) {
//                 boolean found = false;
//                 for (int j = 0; j < n; j++) {
//                     if (nums[j] == i) {
//                         found = true;
//                         break;
//                     }
//                 }
//                 if (!found) {
//                     return i;
//                 }
//             }
//             return -1;
//         }

//         public static void main(String[] args) {
//             int[] nums = {0, 1, 2, 4, 5 };
//             System.out.println(missingNumber(nums));
//         }

// }


//Better Approach
// public class missing_number_12 {
//         public static int missingNumber(int[] nums) {
//             int n = nums.length;
//             boolean[] hash = new boolean[n + 1];
//             for (int i = 0; i < n; i++) {
//                 hash[nums[i]] = true;
//             }

//             for (int i = 0; i <= n; i++) {
//                 if (!hash[i]) {
//                     return i;
//                 }
//             }
//             return -1;
//         }

//         public static void main(String[] args) {
//             int[] nums = { 3, 0,2,4, 1 };
//             System.out.println(missingNumber(nums));
//         }
// }


// Optimal Approach — Sum Formula
// public class missing_number_12 {
//         public static int missingNumber(int[] nums) {
//             int n = nums.length;
//             int expectedSum = n * (n + 1) / 2;
//             int actualSum = 0;
//             for (int i = 0; i < n; i++) {
//                 actualSum += nums[i];
//             }
//             return expectedSum - actualSum;
//         }
//         public static void main(String[] args) {
//             int[] nums = { 3,2, 0, 1 };
//             System.out.println(missingNumber(nums));
//         }
// }



//Even Better Optimal — XOR
public class missing_number_12 {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int xor = 0;
        for(int i=0; i<=n; i++) {
            xor = xor^i;
        }
        for(int i = 0; i< n; i++) {
            xor = xor^nums[i];
        }
        return xor;
    } 
    public static void main(String[] args) {
             int[] nums = { 3,2, 0, 1 };
             System.out.println(missingNumber(nums));
         } 
}