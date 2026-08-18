
public class check_array_is_sorted_03 {
    public static boolean checkSorted(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 3, 2, 4, 5};
        int n = arr1.length;
        int m = arr2.length;

        System.out.println("Array 1 is sorted: " + checkSorted(arr1, arr1.length)); // Expected: true
        System.out.println("Array 2 is sorted: " + checkSorted(arr2, arr2.length)); // Expected: false
    }
}
