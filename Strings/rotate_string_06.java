// public class rotate_string_06 {
//     public static boolean rotateString(String s, String goal) {
//         if(s.length() != goal.length()) {
//             return false;
//         }
//         for(int i =0; i<s.length(); i++) {
//             if(s.equals(goal)) {
//                 return true;
//             }
//             s = s.substring(1) + s.charAt(0);
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         String s = "abcdefg";
//         String goal = "cdefgab";
//         System.out.println(rotateString(s, goal));
//     }
// }



// optimized solution
public class rotate_string_06 {
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String combined = s + s;
        return combined.contains(goal);
    }
    public static void main(String[] args) {
        String s = "abcdefg";
        String goal = "cdefgab";
        System.out.println(rotateString(s, goal));
    }
}