import java.util.HashMap;

public class hashing_using_map_04 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 2};

        // Pre-compute
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Queries
        int[] queries = {1, 2, 3, 4};

        // Fetch
        for (int i = 0; i < queries.length; i++) {
            int number = queries[i];

            System.out.println(map.getOrDefault(number, 0));
        }
    }
}
