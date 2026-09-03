public class search_an_element_03 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
     public static boolean search(Node head, int target){
        Node temp = head;
        while(temp != null){
            if(temp.data == target){
                return true;
            }
            temp = temp.next;
        }
        return false;
     }
     public static void main(String[] args) {
         Node head = new Node(2);
         head.next = new Node(5);
         head.next.next = new Node(8);
         head.next.next.next = new Node(7);
         System.out.println(search(head, 7));
     }
}
