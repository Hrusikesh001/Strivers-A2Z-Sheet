public class GCD_of_two_number_07 {
    public static void main(String[] args) {
        int a = 48;
        int b = 18;
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD is: " + a);
    }
}



// public class GCD_of_two_number_07  {
//     public static int findGCD(int a, int b) {
//         if (b == 0) {
//             return a;
//         }
//         return findGCD(b, a % b);
//     }

//     public static void main(String[] args) {
//         int a = 48;
//         int b = 18;
//         System.out.println("GCD = " + findGCD(a, b));
//     }
// }