import java.util.Scanner;

public class ElectricBill {
    // Basic electric bill
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unit : ");
        int unit = sc.nextInt();
        System.out.println("The gernarted bill is : " + Calculatebill(unit));
    }
    public static double Calculatebill(int unit) {
        double bill = 0 ;
        double unitPrice = 2.50 ;
        bill = unit * unitPrice;
        double tax = 5.25 ;
        bill += tax ;
        return bill ;

    }
}
