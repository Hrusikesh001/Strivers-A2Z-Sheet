public class armstrong_number_04 {
    public static void main(String[] args) {
        int n = 153;
        int original = n;
        int sum = 0;
        while(n != 0) {
            int last_digit = n % 10;
            sum += Math.pow(last_digit, 3);
            // sum = sum + (last_digit * last_digit * last_digit);
            n = n / 10;
        }
        if(original == sum) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}
