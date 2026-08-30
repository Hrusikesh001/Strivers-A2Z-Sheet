// import java.util.*;
// public class isomorphic_strings_05 {
//     public static boolean isIsomorphic(String s, String t) {

//         HashMap<Character, Character> map = new HashMap<>();
//         HashSet<Character> used = new HashSet<>();

//         for (int i = 0; i < s.length(); i++) {

//             char ch1 = s.charAt(i);
//             char ch2 = t.charAt(i);

//             // If ch1 is already mapped
//             if (map.containsKey(ch1)) {

//                 // Check if mapping is consistent
//                 if (map.get(ch1) != ch2) {
//                     return false;
//                 }
//             } else {

//                 // Check if ch2 is already mapped to another character
//                 if (used.contains(ch2)) {
//                     return false;
//                 }

//                 map.put(ch1, ch2);
//                 used.add(ch2);
//             }
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         String s = "egg";
//         String t = "add";
//         System.out.println(isIsomorphic(s, t));
//     }

// }



//optimized solution
public class isomorphic_strings_05{
        public static boolean isIsomorphic(String s, String t) {

            // Different lengths cannot be isomorphic
            if (s.length() != t.length()) {
                return false;
            }

            // Store last occurrence positions
            int[] mapS = new int[256];
            int[] mapT = new int[256];

            for (int i = 0; i < s.length(); i++) {

                char chS = s.charAt(i);
                char chT = t.charAt(i);

                // Check if their previous occurrence pattern is different
                if (mapS[chS] != mapT[chT]) {
                    return false;
                }

                // Store current position
                mapS[chS] = i + 1;
                mapT[chT] = i + 1;
            }

            return true;
        }

        public static void main(String[] args) {

            String s = "paper";
            String t = "title";

            System.out.println(isIsomorphic(s, t));
        }
}