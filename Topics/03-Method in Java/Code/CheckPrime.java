import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        CheckPrime();
    }

    public static void CheckPrime() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        long n = sc.nextLong();
        int count = 0;
        int i = 1;
        while (i <= n) {
            if (n % i == 0) {

                count++;
            }
            i++;
        }
        if (count == 2) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }

}
