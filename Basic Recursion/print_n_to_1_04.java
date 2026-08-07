public class print_n_to_1_04 {
    public void printNum(int i, int n) {
        if (i > n) return;
        printNum(i + 1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        print_n_to_1_04 obj = new print_n_to_1_04();
        obj.printNum(1, 50);
    }
}
