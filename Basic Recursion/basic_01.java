public class basic_01 {
    int count = 0;
    public void printCount() {
        if (count == 3) return;
        System.out.println(count);
        count++;
        printCount();
    }
    public static void main(String[] args) {
        basic_01 obj = new basic_01();
        obj.printCount();
    }
}
