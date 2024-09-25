import java.util.Scanner;
// Q calculate average of n number
public class Average_N_number {
    public static void main(String[] args) {
        // Calculate Average Of N Numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("How man number to find the average : ");
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Invalid numer!");
            return;
        }
        double sum = 0 ;
        for (int i = 1 ; i <= n ; i++) {
            System.out.print("Enter number "+ i + ": ");
            double number = sc.nextDouble();
            sum += number ;  // Add number
        }
        double Average = sum/n ;
        System.out.println("The average of given number is : " + Average);
    }
}
