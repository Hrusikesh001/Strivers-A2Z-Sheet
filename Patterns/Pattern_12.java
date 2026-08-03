// 1      1
// 12    21
// 123  321
// 12344321

public class Pattern_12 {
    public static void main(String[] args) {
        int n = 4;
        for(int i=1; i<=n; i++) {
            //numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            //spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            //numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            
            System.out.println();
        }
    }
}