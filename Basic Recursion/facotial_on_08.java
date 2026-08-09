public class facotial_on_08 {
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        facotial_on_08 obj = new facotial_on_08();
        System.out.println(obj.factorial(3));
    }
}
