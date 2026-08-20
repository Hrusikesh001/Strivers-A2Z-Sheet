//Brute Force Approach
// import java.util.ArrayList;

// public class move_zeros_08 {
//     public static void moveZeros(int[] arr, int n) {
//         ArrayList<Integer> temp = new ArrayList<>();

//         // Store non-zero elements
//         for(int i = 0; i < n; i++) {
//             if(arr[i] != 0) {
//                 temp.add(arr[i]);
//             }
//         }

//         // Copy non-zero elements back
//         int nz = temp.size();
//         for(int i = 0; i < nz; i++) {
//             arr[i] = temp.get(i);
//         }

//         // Fill remaining positions with zero
//         for(int i = nz; i < n; i++) {
//             arr[i] = 0;
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
//         int n = arr.length;
//         moveZeros(arr, n);
//         for(int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }


//Optimal Approach

public class move_zeros_08 {
    public static void moveZeros(int[] arr, int n) {
        int j = -1;
        for(int i = 0; i < n; i++) {
            if(arr[i] == 0){
                j=i;
                break;
            }
        }

        if (j == -1) {
            return;
        }

        for(int i=j+1; i<n; i++) {
            if(arr[i] != 0) {
                swap(arr, i, j);
                j++;
            }
        }
    }
    
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String args[]) {
        int[] arr = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };

        int n = arr.length;

        moveZeros(arr, n);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}