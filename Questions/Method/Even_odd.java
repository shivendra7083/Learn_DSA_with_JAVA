import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        eo(n);
    }
    public static void eo (int a){
        if (a % 2 == 0) {
            System.out.println("The given number is even ");
        }else {
            System.out.println(" The given number is odd");
        }

    }
}
