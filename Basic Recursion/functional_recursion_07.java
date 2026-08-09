public class functional_recursion_07 {
    public int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        functional_recursion_07 obj = new functional_recursion_07();
        System.out.println(obj.sum(3));
    }
}
