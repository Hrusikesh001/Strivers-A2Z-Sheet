// import java.util.Stack;
// public class reverse_words_02 {
//     public static String reverseWords(String s) {
//         Stack<String> stack = new Stack<>();
//         String word = "";

//         // Traverse the string
//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);
//             if (ch != ' ') {
//                 word += ch;
//             } else {
//                 // If a complete word is found
//                 if (!word.isEmpty()) {
//                     stack.push(word);
//                     word = "";
//                 }
//             }
//         }

//         // Push the last word
//         if (!word.isEmpty()) {
//             stack.push(word);
//         }

//         // Build answer by popping words
//         StringBuilder ans = new StringBuilder();
//         while (!stack.isEmpty()) {
//             ans.append(stack.pop());
//             if (!stack.isEmpty()) {
//                 ans.append(" ");
//             }
//         }
//         return ans.toString();
//     }

//     public static void main(String[] args) {
//         String s = "a good   example";
//         System.out.println(reverseWords(s));
//     }

// }




//Optimal Approach
public class reverse_words_02 {
        public static String reverseWords(String s) {
            StringBuilder ans = new StringBuilder();
            int i = s.length() - 1;
            while (i >= 0) {
                // Skip spaces
                while (i >= 0 && s.charAt(i) == ' ') {
                    i--;
                }

                // Find the end of the word
                int end = i;

                // Move until the beginning of the word
                while (i >= 0 && s.charAt(i) != ' ') {
                    i--;
                }

                // Add the word
                if (end >= 0) {
                    ans.append(s.substring(i + 1, end + 1));
                    ans.append(" ");
                }
            }
            return ans.toString().trim();
        }

        public static void main(String[] args) {
            String s = "a good   example";
            System.out.println(reverseWords(s));
        }
}