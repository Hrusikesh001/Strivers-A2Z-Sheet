// public class reverse_an_array_09 {
//     public void reverse(int arr[], int i, int j) {
//         if (i >= j) return;
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//         reverse(arr, i + 1, j - 1);
//     }
//     public static void main(String[] args) {
//         reverse_an_array_09 obj = new reverse_an_array_09();
//         int arr[] = {1, 2, 3, 4, 5};
//         obj.reverse(arr, 0, arr.length - 1);
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

public class reverse_an_array_09 {
    public void reverse(int arr[], int i) {
        if (i >= arr.length / 2) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;
        reverse(arr, i + 1);
    }
    public static void main(String[] args) {
        reverse_an_array_09 obj = new reverse_an_array_09();
        int arr[] = {1, 2, 3, 4, 5};
        obj.reverse(arr, 0);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}