public class how_many_times_a_appear_in_array_01 {
    public int countOccurrences(int[] arr, int index, int num) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == num) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        how_many_times_a_appear_in_array_01 obj = new how_many_times_a_appear_in_array_01();
        int[] arr = {1, 2, 3, 1, 4, 1}; // Change this array to compute occurrences of a different array
        int num = 1; // Change this value to find occurrences of a different number
        int occurrences = obj.countOccurrences(arr, 0, num);
        System.out.println("The number " + num + " appears " + occurrences + " times in the array.");
    }
}