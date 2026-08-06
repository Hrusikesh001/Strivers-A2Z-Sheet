public class check_palindrome_03 {
    public static void main(String[] args) {
        int n = 12321;
        int original = n;
        int rev = 0;
        while(n != 0) {
            int last_digit = n % 10;
            rev = rev * 10 + last_digit;
            n = n / 10;
        }
        if(original == rev) {
            System.out.println(original + " is a palindrome number.");
        } else {
            System.out.println(original + " is not a palindrome number.");
        }
    }    
}
