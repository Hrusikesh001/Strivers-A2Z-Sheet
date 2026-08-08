public class sum_of_first_n_number_06 {
    public int sum(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return 0;
        }
        return sum(i - 1, sum + i);
    }

    public static void main(String[] args) {
        sum_of_first_n_number_06 obj = new sum_of_first_n_number_06();
        obj.sum(3, 0);
    }
}
