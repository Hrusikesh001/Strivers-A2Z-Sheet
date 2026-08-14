public class RecursiveInsertionSort_06 {
    public static void recursiveInsertionSort(int[] arr,int i, int n) {
        if(i == n) return ;

        int j = i;
        while(j > 0 && arr[j-1] > arr[j]) {
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j--;
        }
        recursiveInsertionSort(arr, i+1, n);
    }
    public static void main(String[] args) {
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        int n = arr.length;

        recursiveInsertionSort(arr, 1, n);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
