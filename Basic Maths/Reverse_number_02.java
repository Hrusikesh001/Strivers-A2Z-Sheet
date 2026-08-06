
public class Reverse_number_02 {
    public static void main(String[] args) {
        int n = -123;
        int rev = 0;
        while(n != 0) {
            int last_digit = n % 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return;
            }
            rev = rev * 10 + last_digit;
            n = n / 10;
        }
        System.out.println("Reversed number: " + rev);
    }
}
