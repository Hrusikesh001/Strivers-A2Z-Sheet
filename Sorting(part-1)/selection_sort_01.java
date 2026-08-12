public class selection_sort_01 {
    static void selectionSort(int[] arr, int n) {
        for (int i = 0; i <= n - 2; i++) {
            int mini = i;
            for (int j = i; j <= n-1; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            // Swap
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        int n = arr.length;

        selectionSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
