public class print_1ton_backtracking_05 {
    public void printNum(int i, int n) {
        if (i<1) return;
        printNum(i - 1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        print_1ton_backtracking_05 obj = new print_1ton_backtracking_05();
        obj.printNum(3,3);
    }
}
