import java.util.Scanner;
// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
public class Lar_Smal_3_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 :");
        int a = sc.nextInt();
        System.out.print("ENter number 2 :");
        int b = sc.nextInt();
        System.out.print("Enter number 3 :");
        int c = sc.nextInt();
        int largest = largest(a , b , c) ;
        int smallest = smallest(a ,b ,c) ;
        System.out.println("The largest number is : " + largest );
        System.out.print("The smallest number is : "+ smallest);

    }
    public static int largest(int a ,int b , int c) {
        int max = a ;
        if (max < b){
            max = b ;
        }
        if(max < c) {
            max = c ;
        }
        return max ;
    }
    public static int smallest(int a,int b , int c ) {
        int min = a ;
        if (min>b){
            min = b ;
        }
        if (min > c) {
            min = c ;
        }
        return min ;
    }
}
