//Bruteforce approach
// public class two_sum_01 {
//     public static int[] twoSum(int[] arr, int target) {
//         int n = arr.length;
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[i] + arr[j] == target) {
//                     return new int[] { i, j };
//                 }
//             }
//         }
//         return new int[] { -1, -1 };
//     }

//     public static void main(String[] args) {
//         int[] arr = { 2, 6, 5, 8, 11 };
//         int target = 14;
//         int[] result = twoSum(arr, target);
//         System.out.println(result[0] + " " + result[1]);
//     }
// }



//Better approach
// import java.util.*;
// public class two_sum_01 {
//     public static int[] twoSum(int[] nums, int target) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for (int i = 0; i < nums.length; i++) {
//             int remaining = target - nums[i];
//             if (map.containsKey(remaining)) {
//                 return new int[]{map.get(remaining), i};
//             }
//             map.put(nums[i], i);
//         }
//         return new int[]{-1, -1};
//     }
//     public static void main(String[] args) {
//         int[] arr = { 2, 6, 5, 8, 11 };
//         int target = 14;
//         int[] result = twoSum(arr, target);
//         System.out.println(result[0] + " " + result[1]);
//      }
// }


//optimal approach
// import java.util.*;
// public class two_sum_01 {
//     public static boolean twoSum(int[] arr, int target) {
//         Arrays.sort(arr);
//         int left = 0;
//         int right = arr.length-1;
//         while(left<right) {
//             int sum = arr[left] + arr[right];
//             if(sum == target) {
//                 return true;
//             }else if (sum < target) {
//                 left++;
//             }else {
//                 right--;
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]) {
//         int arr[] = {2, 6, 5, 8, 11};
//         int target = 14;
//         System.out.println(twoSum(arr, target));

//     }
// }



// optimal two-pointer approach and get the values of the two elements
import java.util.*;
public class two_sum_01 {
    public static int[] twoSum(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return new int[] { arr[left], arr[right] };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 5, 8, 11 };
        int target = 14;
        int[] result = twoSum(arr, target);
        System.out.println(result[0] + ", " + result[1]);
    }
}