// import java.util.*;
// public class removeOuterParentheses_01 {
//     public static String removeOuterParentheses(String s) {
//         String ans = "";
//         Stack<Character> st = new Stack<>();

//         for (char ch : s.toCharArray()) {
//             if (ch == ')') {
//                 st.pop();
//             }

//             if (!st.empty()) {
//                 ans += ch;
//             }

//             if (ch == '(') {
//                 st.push(ch);
//             }
//         }

//         return ans;
//     }

//     public static void main(String[] args) {
//         String s = "()(())(())(()(()))";
//         System.out.println(removeOuterParentheses(s));
//     }
// }




//Optimal Approach
import java.util.Stack;
public class removeOuterParentheses_01 {
    public static String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (count > 0) {
                    ans.append(ch);
                }
                count++;
            }
            else {
                count--;
                if (count >0) {
                    ans.append(ch);
                }
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "()(())(())(()(()))";
        System.out.println(removeOuterParentheses(s));
    }
}