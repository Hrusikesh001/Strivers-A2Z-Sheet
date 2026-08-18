public class largest_element_01 {
    public static int largestElement(int[] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        int largest = largestElement(arr);
        System.out.println("The largest element in the array is: " + largest);
    }
}

// import java.util.Arrays;

// public class largest_element_01 {
//     public static int sortArr(int[] arr) {
//         // Sort the array in ascending order
//         Arrays.sort(arr);

//         // Return the last element (largest element) after sorting
//         return arr[arr.length - 1];
//     }

//     public static void main(String[] args) {
//         int[] arr = { 4, 6, 2, 5, 7, 9, 1, 3 };
//         int largest = sortArr(arr);
//         System.out.println("The largest element in the array is: " + largest);
//     }
// }
