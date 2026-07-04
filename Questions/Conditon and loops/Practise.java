import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0 ;
        int original = n ;

        for (int i = n ; n > 0 ; i++) {
            int digit = n % 10 ;
            rev = rev * 10 + digit;
            n/=10 ;

        }
        //System.out.println(rev);
        if (rev == original) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
