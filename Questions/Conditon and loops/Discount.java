import java.util.Scanner;
// Q. Calculate Discount Of Product
public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the original amount of product : ");
        float OriginalAmount = sc.nextFloat();
        System.out.print("Discount percent : ");
        float Dpercent = sc.nextFloat();
        double discount = OriginalAmount * (Dpercent/100) ;
        System.out.println("Dicount price : " + discount);
        System.out.print("FInal price of product is : ");
        double Finalprice = (OriginalAmount - discount) ;
        System.out.println(Finalprice);
    }
}