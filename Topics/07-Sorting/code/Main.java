// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int [] arr = new int[n] ;
        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
        System.out.print(Arrays.toString(arr));
    }
    public static void selectionSort (int [] arr ) {
        int n = arr.length ;
        for(int i = 0 ; i < n-1 ; i++) {
            int minIndex = i ;
            for(int j = i+1  ; j < n ; j++) {
                if(arr[minIndex] > arr [j]) {
                    minIndex = j ;
                }
            }
            if(arr[minIndex] != arr[i]) {
                int temp = arr[i] ;
                arr[i] = arr[minIndex] ;
                arr[minIndex] = temp ;
            }
        }
    }
}