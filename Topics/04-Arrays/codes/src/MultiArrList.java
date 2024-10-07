import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new  ArrayList<>() ;

        // Initialize the outer ArrayList (3 rows)
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>()); // Each row is a new ArrayList
        }

        // Add element
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}
