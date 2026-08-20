public class linear_search_09 {
    public static int search(int arr[], int num) {
        for(int i = 0; i<=num; i++) {
            if(arr[i] == num) {
                return i;
            }
        }
        return -1;
    } 
    public static void main(String args[]) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int num = 30;
        int result = search(arr, num);
        System.out.println("Element found at index: " + result);
    }
}
