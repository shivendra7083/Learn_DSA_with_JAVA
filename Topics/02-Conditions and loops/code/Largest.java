import java.util.Scanner;

public class Largest {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Q find the largest of the 3 numbers

        int max = a ;
        if(b > max) {
            max = b ;
        }
        if (c > max) {
            max = c ;
        }
        System.out.print("largest number is : " + max);
    }
}
