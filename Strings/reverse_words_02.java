import java.util.Stack;
public class reverse_words_02 {
    public static String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        String word = "";

        // Traverse the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                // If a complete word is found
                if (!word.isEmpty()) {
                    stack.push(word);
                    word = "";
                }
            }
        }

        // Push the last word
        if (!word.isEmpty()) {
            stack.push(word);
        }

        // Build answer by popping words
        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()) {
            ans.append(stack.pop());
            if (!stack.isEmpty()) {
                ans.append(" ");
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }

}
