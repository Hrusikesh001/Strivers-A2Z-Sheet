
public class count_number_01 {
    public static void main(String[] args) {
        int n = 5789;
        int cnt = 0;
        while(n>0) {
            int last_digit = n % 10;
            cnt = cnt +1;
            n = n / 10;
            System.out.println(last_digit);
        }
        System.out.println("Number of digits: " + cnt);
    }
}
