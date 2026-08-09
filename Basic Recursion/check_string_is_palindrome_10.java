public class check_string_is_palindrome_10 {
    public boolean isPalindrome(String str, int i, int n) {
        if (i >= n/2) {
            return true;
        }
        if (str.charAt(i) != str.charAt(n-i-1)) {
            return false;
        }
        return isPalindrome(str, i + 1, n);
    }

    public static void main(String[] args) {
        check_string_is_palindrome_10 obj = new check_string_is_palindrome_10();
        String str = "racecar";
        if (obj.isPalindrome(str, 0, str.length())) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}
