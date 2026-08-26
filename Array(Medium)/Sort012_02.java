// //Bruteforce approach
// import java.util.*;
// public class Sort012_02 {
//     public static void main(String[] args) {
//         int[] arr = {2, 0, 2, 1, 1, 0};
//         Arrays.sort(arr);
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }



//Better Approach
// public class Sort012_02 {
//         public static void sortArray(int[] arr) {
//             int count0 = 0;
//             int count1 = 0;
//             int count2 = 0;
//             for (int num : arr) {
//                 if (num == 0) {
//                     count0++;
//                 } else if (num == 1) {
//                     count1++;
//                 } else {
//                     count2++;
//                 }
//             }
//             int index = 0;
//             while (count0 > 0) {
//                 arr[index++] = 0;
//                 count0--;
//             }
//             while (count1 > 0) {
//                 arr[index++] = 1;
//                 count1--;
//             }
//             while (count2 > 0) {
//                 arr[index++] = 2;
//                 count2--;
//             }
//         }

//         public static void main(String[] args) {
//             int[] arr = { 2, 0, 2, 1, 1, 0 };
//             sortArray(arr);
//             for (int num : arr) {
//                 System.out.print(num + " ");
//             }
//         }
// }



//Optimal Approach
public class Sort012_02 {
    public static void sortArray(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }

            else if (arr[mid] == 1) {
                mid++;
            }

            else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 0, 2, 1, 1, 0 };
        sortArray(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}