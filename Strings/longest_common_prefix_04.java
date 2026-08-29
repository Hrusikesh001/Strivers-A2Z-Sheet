// public class longest_common_prefix_04 {
//         public static String longestCommonPrefix(String[] strs) {

//             // Take the first string
//             String first = strs[0];

//             for (int i = 0; i < first.length(); i++) {
//                 char ch = first.charAt(i);

//                 // Compare this character with all other strings
//                 for (int j = 1; j < strs.length; j++) {

//                     // If string is shorter OR characters don't match
//                     if (i >= strs[j].length() || strs[j].charAt(i) != ch) {

//                         return first.substring(0, i);
//                     }
//                 }
//             }

//             return first;
//         }

//         public static void main(String[] args) {
//             String[] strs = { "flower", "flow", "flight" };
//             System.out.println(longestCommonPrefix(strs));
//         }
// }





//Optimal Approach
public class longest_common_prefix_04 {
        public static String longestCommonPrefix(String[] strs) {
            // Start with first string as prefix
            String prefix = strs[0];

            // Compare prefix with remaining strings
            for (int i = 1; i < strs.length; i++) {

                // Keep reducing prefix until it matches
                while (!strs[i].startsWith(prefix)) {

                    // Remove last character
                    prefix = prefix.substring(0, prefix.length() - 1);

                    // No common prefix
                    if (prefix.isEmpty()) {
                        return "";
                    }
                }
            }
            return prefix;
        }

        public static void main(String[] args) {
            String[] strs = { "flower", "flow", "flight" };
            System.out.println(longestCommonPrefix(strs));
        }
}
