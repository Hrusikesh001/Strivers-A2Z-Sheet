//    *   
//   ***  
//  ***** 
// *******

public class Pattern_07 {
    public static void main(String[] args) {
        int n = 4;
        for(int i=0; i<n; i++) {
            //space
            for(int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            //star
            for(int k=0; k<2*i+1; k++) {
                System.out.print("*");
            }
            //space
            for(int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
