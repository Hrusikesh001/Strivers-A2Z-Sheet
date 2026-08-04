// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********

public class Pattern_19 {
    public static void main(String[] args) {
        int n = 5;
        int space = 0;
        for (int i = 0; i < n; i++) {
            //stars
            for(int j=0; j<n-i; j++) {
                System.out.print("*");
            }
            //spaces
            for(int j=0; j<space; j++) {
                System.out.print(" ");
            }
            //stars
            for(int j=0; j<n-i; j++) {
                System.out.print("*");
            }
            space += 2;
            System.out.println();
        }

        // //bottom half
        space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            space -= 2;
            System.out.println();
        }
    }
}
