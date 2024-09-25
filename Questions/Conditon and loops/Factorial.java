import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Q. Factorial Program in java
        // 5! = 5*4*3*2*1
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int facto = 1;
        for (int i = 1 ; i <= n ; i++){
            facto = facto*i ;
        }
        System.out.println("The factorial of given no is : " + facto);
    }
}
