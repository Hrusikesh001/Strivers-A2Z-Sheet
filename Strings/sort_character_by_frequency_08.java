import java.util.*;
public class sort_character_by_frequency_08 {
    public static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        StringBuilder result = new StringBuilder();

        // Step 2: Process until map becomes empty
        while (!map.isEmpty()) {

            char maxChar = ' ';
            int maxFreq = 0;

            // Step 3: Find character with maximum frequency
            for (char ch : map.keySet()) {

                if (map.get(ch) > maxFreq) {
                    maxFreq = map.get(ch);
                    maxChar = ch;
                }
            }

            // Step 4: Add character maxFreq times
            for (int i = 0; i < maxFreq; i++) {
                result.append(maxChar);
            }

            // Step 5: Remove processed character
            map.remove(maxChar);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
}
