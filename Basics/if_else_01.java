import java.util.*;
public class if_else_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age < 18) {
            System.out.println("Not eligible for job");
        } else if(age >= 18 && age <= 54) {
            System.out.println("Eligible for job");
        } else if(age >= 55 && age <= 57) {
            System.out.println("Eligible for job, but retirement soon");
        } else {
            System.out.println("Retired");
        }
    }
}