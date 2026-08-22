// import java.util.*;
// public class intersection_of_two_array_11 {

//     public static ArrayList<Integer> intersection(int[] a, int[] b) {

//         ArrayList<Integer> result = new ArrayList<>();

//         int i = 0;
//         int j = 0;

//         while (i < a.length && j < b.length) {

//             if (a[i] == b[j]) {

//                 // Avoid duplicate elements
//                 if (result.isEmpty() ||
//                         result.get(result.size() - 1) != a[i]) {

//                     result.add(a[i]);
//                 }

//                 i++;
//                 j++;

//             } else if (a[i] < b[j]) {

//                 i++;

//             } else {

//                 j++;
//             }
//         }

//         return result;
//     }

//     public static void main(String[] args) {

//         int[] a = { 1, 2, 3, 3, 4, 5 };
//         int[] b = { 2, 3, 3, 4, 6, 7 };

//         ArrayList<Integer> result = intersection(a, b);

//         System.out.println(result);
//     }

// }



//alternate approach
import java.util.*;
public class intersection_of_two_array_11 {
    public static ArrayList<Integer> findArrayIntersection(
            int[] A, int[] B) {

        int i = 0;
        int j = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        while (i < A.length && j < B.length) {

            if (A[i] < B[j]) {
                i++;
            } else if (B[j] < A[i]) {
                j++;
            } else {
                ans.add(A[i]);

                i++;
                j++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] A = { 1, 2, 3, 3, 4, 5 };
        int[] B = { 2, 3, 3, 4, 6, 7 };

        ArrayList<Integer> ans = findArrayIntersection(A, B);

        System.out.println(ans);
    }
}
