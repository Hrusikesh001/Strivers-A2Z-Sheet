import java.util.*;

public class Counting_Frequencies_of_Array_Elements_05 {
    public List<List<Integer>> countFrequencies(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<List<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            List<Integer> pair = new ArrayList<>();
            pair.add(entry.getKey());
            pair.add(entry.getValue());
            result.add(pair);
        }
        return result;
    }
    public static void main(String[] args) {
        Counting_Frequencies_of_Array_Elements_05 obj = new Counting_Frequencies_of_Array_Elements_05();
        int[] nums = {1, 2, 2, 3, 1, 2};
        List<List<Integer>> result = obj.countFrequencies(nums);
        System.out.println(result);
    }
}
