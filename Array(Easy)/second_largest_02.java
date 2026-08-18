// Brute Force Approach
// import java.util.Arrays;
// public class second_largest_02 {
//     public static int secondLargestElement(int[] arr, int n) {
//         // Sort the array
//         Arrays.sort(arr);

//         // Largest element
//         int largest = arr[n - 1];

//         // Find second largest
//         for (int i = n - 2; i >= 0; i--) {
//             if (arr[i] != largest) {
//                 return arr[i];
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 4, 6, 2, 5, 7, 9, 1, 3 };
//         int n = arr.length;
//         int secondLargest = secondLargestElement(arr, n);
//         System.out.println(secondLargest);
//     }
// }



// Better Approach
// public class second_largest_02 {
//     public static int secondLargestElement(int[] arr, int n) {
//         int largest = arr[0];
//         for(int i = 0; i < n; i++) {
//             if(arr[i] > largest) {
//                 largest = arr[i];
//             }
//         }
//         int secondLargest = -1;
//         for(int i = 0; i < n; i++) {
//             if(arr[i] > secondLargest && arr[i] != largest) {
//                 secondLargest = arr[i];
//             }
//         }
//         return secondLargest;
//     }
//     public static void main(String[] args) {
//         int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
//         int n = arr.length;
//         int secondLargest = secondLargestElement(arr, n);
//         System.out.println("The second largest element in the array is: " + secondLargest);
//     }
// }



// Optimal Approach
public class second_largest_02 {
    public static int secondLargestElement(int[] arr, int n) {
        int largest = arr[0];
        int secondLargest = -1;
        for(int i = 1; i < n; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } 
            else if(arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static int secondSmallestElement(int[] arr, int n) {
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++) {
            if(arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            
            }
            else if(arr[i] != smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        int n = arr.length;
        int secondLargest = secondLargestElement(arr, n);
        int secondSmallest = secondSmallestElement(arr, n);
        System.out.println("The second largest element in the array is: " + secondLargest);
        System.out.println("The second smallest element in the array is: " + secondSmallest);
    
    }
}