public class largestOddNumber_03 {

    public static String largestOddNumber(String num) {

        // Start checking from the right side
        for (int i = num.length() - 1; i >= 0; i--) {

            char ch = num.charAt(i);

            // Check if the digit is odd
            if ((ch - '0') % 2 == 1) {

                // Return substring from index 0 to i
                return num.substring(0, i + 1);
            }
        }

        // No odd digit found
        return "";
    }

    public static void main(String[] args) {
        String num = "52";
        System.out.println(largestOddNumber(num));
    }
}