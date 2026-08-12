public class precomputation_02 {
    public static void main(String[] args) {

        int[] arr = { 1, 3, 2, 1, 3 };

        // Precompute
        int[] hash = new int[13];

        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        // Queries
        int[] queries = { 1, 4, 2, 3, 12 };

        // Fetch
        for (int i = 0; i < queries.length; i++) {
            int number = queries[i];
            System.out.println(hash[number]);
        }
    }
}
