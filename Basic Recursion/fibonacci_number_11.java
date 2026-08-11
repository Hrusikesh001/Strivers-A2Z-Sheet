public class fibonacci_number_11 {
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        fibonacci_number_11 obj = new fibonacci_number_11();
        int n = 4; // Change this value to compute a different Fibonacci number
        System.out.println("Fibonacci number at position " + n + " is: " + obj.fibonacci(n));
    }
}
