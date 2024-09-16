import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print(" Enter number : ");
        int n = sc.nextInt();
        int reversednum = 0 ;
        while (n > 0) {
            int lastdigit =  n % 10 ;
            //reversednum = reversednum * 10 + lastdigit ;
            System.out.print(lastdigit);
            n = n/10 ;
        }
        //System.out.println("Reverse num is : " + reversednum);
    }
}