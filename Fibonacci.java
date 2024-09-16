import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        int a = 0 ;
        int b = 1 ;
        //System.out.print(a + " " + b);
        for (int i = 2 ; i <= n ; i++ ) {
            int next = a + b ;
            //System.out.print(" " + next);
            a = b ;
            b = next ;
        }
        System.out.println(b);
    }
}
