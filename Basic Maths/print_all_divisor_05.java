public class print_all_divisor_05 {
    public static void main(String[] args) {
        int n = 12;
        System.out.print("Divisors of " + n + " are: ");
        for(int i=1; i<=n; i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
