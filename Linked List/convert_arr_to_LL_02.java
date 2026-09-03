public class convert_arr_to_LL_02 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private static Node converter(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = mover.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 7 };
        Node head = converter(arr);
        System.out.println(head.data);
    }
}
