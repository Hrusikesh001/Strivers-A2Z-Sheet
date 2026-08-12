import java.util.HashMap;
import java.util.Map;

public class Highest_Occurring_Element_in_an_Array_06 {
    public int mostFrequentElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int answer = Integer.MAX_VALUE;

        // Find most frequent element
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int num = entry.getKey();
            int freq = entry.getValue();

            if (freq > maxFreq || (freq == maxFreq && num < answer)) {
                maxFreq = freq;
                answer = num;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Highest_Occurring_Element_in_an_Array_06 obj = new Highest_Occurring_Element_in_an_Array_06();
        int[] nums = {1, 2, 2, 3, 1, 1, 2};
        int result = obj.mostFrequentElement(nums);
        System.out.println(result);
    }
}
