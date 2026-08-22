// import java.util.*;
// public class union_of_array_10 {
//     public static ArrayList<Integer> sortedArray(int[] a, int[] b) {
//         int n1 = a.length;
//         int n2 = b.length;

//         // Set stores only unique elements
//         TreeSet<Integer> st = new TreeSet<>();

//         // Insert elements of first array
//         for (int i = 0; i < n1; i++) {
//             st.add(a[i]);
//         }

//         // Insert elements of second array
//         for (int i = 0; i < n2; i++) {
//             st.add(b[i]);
//         }

//         // Convert set to ArrayList
//         ArrayList<Integer> temp = new ArrayList<>();

//         for (int it : st) {
//             temp.add(it);
//         }

//         return temp;
//     }

//     public static void main(String[] args) {

//         int[] a = { 1, 2, 3, 4 };
//         int[] b = { 2, 3, 5, 6 };

//         ArrayList<Integer> result = sortedArray(a, b);

//         System.out.println(result);
//     }

// }


//optimal approach
import java.util.*;

public class union_of_array_10 {
    public static ArrayList<Integer> union(int[] a, int[] b) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                if (result.isEmpty() ||
                        result.get(result.size() - 1) != a[i]) {
                    result.add(a[i]);
                }
                i++;

            } else if (b[j] < a[i]) {
                if (result.isEmpty() ||
                        result.get(result.size() - 1) != b[j]) {
                    result.add(b[j]);
                }
                j++;

            } else {
                if (result.isEmpty() ||
                        result.get(result.size() - 1) != a[i]) {
                    result.add(a[i]);
                }
                i++;
                j++;
            }
        }

        while (i < a.length) {
            if (result.isEmpty() ||
                    result.get(result.size() - 1) != a[i]) {
                result.add(a[i]);
            }
            i++;
        }

        while (j < b.length) {
            if (result.isEmpty() ||
                    result.get(result.size() - 1) != b[j]) {
                result.add(b[j]);
            }
            j++;
        }

        return result;
    }
    
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        int[] b = { 2, 3, 5, 6 };
        ArrayList<Integer> result = union(a, b);
        System.out.println(result);
    }
}