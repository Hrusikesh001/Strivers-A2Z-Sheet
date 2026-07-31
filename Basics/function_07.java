import java.util.*;
public class function_07 {
    public static void Sum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum of two numbers is: " + sum);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Sum(a, b);
        sc.close();
    }
}
