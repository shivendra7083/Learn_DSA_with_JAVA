import java.util.Arrays;
import java.util.Scanner;

public class Practice_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Problem 1

        /*
        // Create an array of  5 float and calculate thier sum

        float [] marks = { 25.3f , 45.96f , 48.23f , 98.65f , 41.0f } ;
        float sum = 0 ;
        for (float element : marks ) {
            sum += element ;
        }
        System.out.println("The value of sum is : " +sum);
*/

        // Problem 2
/*
        // Write a program to find the wheather the given integer is present in a array or not

        float[] marks = {25.3f, 45.96f, 48.23f, 98.65f, 41.0f};
        System.out.println("Enter the value to find : ");
        float value = sc.nextFloat();

        boolean target = false;
        for (float element : marks) {
            if (value == element) {
                target = true;
                break;
            }
        }
        if (target = true) {
            System.out.println("The value of given no is present in array");
        } else {
            System.out.println("The value of given no is not present in the array");
        }
*/

        // Problem 3
/*
        // Calculate avg marks form an aray conatining marks of all student in physics using for-each loop

        float [] marks = { 25.3f , 45.96f , 48.23f , 98.65f , 41.0f } ;
        float sum = 0 ;
        for (float element : marks ) {
            sum += element ;
        }
        float avg = sum/marks.length ;
        System.out.println("The avg marks of student in physics are  : " + avg );
 */
        // Problem 4

        /*

        // Calculate a java rogram to add 2 matrixs of size 2*3  .

        int [][] mat1 = {
                {1,2,3,},
                {5,7,8,},
        } ;
        int [][] mat2 = {
                {11 , 12 , 13},
                {14 , 15 , 16}
        } ;

        int[][] result = new int[2][3] ;
        // Adding two matrices
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j] ;
                // Print th result
                System.out.print(result[i][j] + " " );
            }
            System.out.println(" ");
        }
//        // Print the result
//        for (int i = 0; i < 2; i++) {
//            System.out.println(Arrays.toString(result[i]));
//            }
*/
        // Problem 5

        /*

        // Write a program to reverse an array

        int num[] = {21, 41, 451, 7, 95, 45, 35};
        int l = num.length;
        int n = Math.floorDiv(l, 2);
        int temp;
        // reversing the array
        for (int i = 0; i < n ; i++) {
            temp = num[i];
            num[i] = num[l - i - 1];
            num[l - i - 1] = temp;
        }
        // Printing tr reversed array
        for (int element : num) {
            System.out.print( element + "  ");
            //System.out.println(" ");
        }
*/

        // Problem 6
/*
        // Write a java program to find the largest element of the array

        int num[] = {21, 41, 451, 7, 95, 45, 35};
        int max = 0 ;
        for (int i = 0; i < num.length; i++) {
            int z = num[i];
            if (z > max) {
                max = z;

            }
        }
        System.out.print("THe maimum value of array is : " + max);


 */
    }
}
