import java.util.*;
public class function_06 {
    
        public static void printName(String name) {
            System.out.println(name);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            printName(name);
            sc.close();
        }
}
