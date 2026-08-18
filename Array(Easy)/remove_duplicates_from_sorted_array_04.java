public class remove_duplicates_from_sorted_array_04 {
    public static int removeDuplicates(int[] arr) {
        int i = 0;
        for(int j = 1; j < arr.length; j++) {
            if(arr[i] != arr[j]) {
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3};
        int n = removeDuplicates(arr);
        System.out.println(n);
    }
}
