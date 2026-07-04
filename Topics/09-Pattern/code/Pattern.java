public class Pattern {
    public static void main(String[] args) {
        int n = 6;
        System.out.println("n : " + n);
//        pattern1(n);
//        pattern2(n);
        pattern3(n);
    }

    static void pattern1(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int col = 1; col < n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2 (int n) {
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3 (int n) {
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

