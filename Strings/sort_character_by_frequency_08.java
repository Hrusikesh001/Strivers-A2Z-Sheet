// import java.util.*;
// public class sort_character_by_frequency_08 {
//     public static String frequencySort(String s) {
//         HashMap<Character, Integer> map = new HashMap<>();

//         // Step 1: Count frequency
//         for (char ch : s.toCharArray()) {
//             map.put(ch, map.getOrDefault(ch, 0) + 1);
//         }

//         StringBuilder result = new StringBuilder();

//         // Step 2: Process until map becomes empty
//         while (!map.isEmpty()) {

//             char maxChar = ' ';
//             int maxFreq = 0;

//             // Step 3: Find character with maximum frequency
//             for (char ch : map.keySet()) {

//                 if (map.get(ch) > maxFreq) {
//                     maxFreq = map.get(ch);
//                     maxChar = ch;
//                 }
//             }

//             // Step 4: Add character maxFreq times
//             for (int i = 0; i < maxFreq; i++) {
//                 result.append(maxChar);
//             }

//             // Step 5: Remove processed character
//             map.remove(maxChar);
//         }
//         return result.toString();
//     }

//     public static void main(String[] args) {
//         String s = "tree";
//         System.out.println(frequencySort(s));
//     }
// }



//Better approach
// import java.util.*;
// public class sort_character_by_frequency_08 {
//     public static String frequencySort(String s) {
//         HashMap<Character, Integer> map = new HashMap<>();

//         // Count frequency
//         for (char ch : s.toCharArray()) {
//             map.put(ch, map.getOrDefault(ch, 0) + 1);
//         }

//         // Store unique characters
//         List<Character> characters = new ArrayList<>(map.keySet());

//         // Sort based on frequency in decreasing order
//         characters.sort((a, b) -> map.get(b) - map.get(a));

//         StringBuilder result = new StringBuilder();

//         // Add characters according to frequency
//         for (char ch : characters) {

//             int frequency = map.get(ch);

//             for (int i = 0; i < frequency; i++) {
//                 result.append(ch);
//             }
//         }

//         return result.toString();
//     }

//     public static void main(String[] args) {

//         String s = "tree";

//         System.out.println(frequencySort(s));
//     }
// }




//optimal approach
import java.util.*;
public class sort_character_by_frequency_08 {
    public static String frequencySort(String s) {

        // Step 1: Count frequency
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Create buckets
        List<Character>[] bucket = new ArrayList[s.length() + 1];

        for (char ch : map.keySet()) {
            int freq = map.get(ch);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(ch);
        }

        // Step 3: Build answer from highest frequency
        StringBuilder result = new StringBuilder();
        for (int freq = s.length(); freq >= 1; freq--) {
            if (bucket[freq] != null) {
                for (char ch : bucket[freq]) {
                    for (int i = 0; i < freq; i++) {
                        result.append(ch);
                    }
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
}