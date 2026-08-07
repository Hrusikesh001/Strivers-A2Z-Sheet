public class print_name_5_times_02 {
    public void printName(int count) {
        if (count == 5) return;
        System.out.println("Hrusikesh");
        // count++;
        printName(count + 1);
    }
    public static void main(String[] args) {
        print_name_5_times_02 obj = new print_name_5_times_02();
        obj.printName(0);
    }
}
