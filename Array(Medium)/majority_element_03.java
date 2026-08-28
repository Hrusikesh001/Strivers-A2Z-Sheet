// public class majority_element_03 {
//     public static int majorityElement(int arr[]) {
//         int n = arr.length;
//         for (int i = 0; i < n; i++) {
//             int count = 0;
//             for (int j = 0; j < n; j++) {
//                 if (arr[i] == arr[j]) {
//                     count++;
//                 }
//             }
//             if (count > n / 2) {
//                 return arr[i];
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 2, 2, 3, 3, 1, 2, 2 };
//         System.out.println(majorityElement(arr));
//     }
// }



//Better Approach
import java.util.HashMap;
public class majority_element_03 {
    public  static int majorityElement(int arr[]) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            if (map.get(arr[i]) > n / 2) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 2, 2, 3, 3, 1, 2, 2 };
        System.out.println(majorityElement(arr));
    }
}