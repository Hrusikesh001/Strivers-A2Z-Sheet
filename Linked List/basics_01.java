public class basics_01 {
    static class Node {
        int data;
        Node next;

        // Constructor with data and next node
        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        // Constructor with only data
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 7 };
        Node y = new Node(arr[0], null);
        System.out.println(y.data);
    }
}
