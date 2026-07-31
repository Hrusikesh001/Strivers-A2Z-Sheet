public class pass_by_value_08 {
    public static void doSomething(int num) {
        num += 5;
        System.out.println(num);
        num += 5;
        System.out.println(num);
    }
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);
        doSomething(num);
        System.out.println(num);
    }
}
