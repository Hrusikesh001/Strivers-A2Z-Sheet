public class print_1_to_n_03 {
    public void printNum(int i, int n) {
        if (i>n) return;
        System.out.println(i);
        printNum(i + 1, n);
        
    }
    public static void main(String[] args) {
        print_1_to_n_03 obj = new print_1_to_n_03();
        obj.printNum(1, 50);
    }
}
