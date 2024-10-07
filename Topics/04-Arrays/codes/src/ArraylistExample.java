import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      /*  // Syntax
        Arraylist<type> list Name = new Arraylist<type>();
        Key Methods of ArraylistExample:
                add(element) – Adds an element to the end of the list.
                get(index) – Retrieves the element at the specified position.
                set(index, element) – Updates the element at the specified position.
                remove(index) – Removes the element at the specified position.
                size() – Returns the number of elements in the list.
                contain() -

       */
        ArrayList<Integer> list = new ArrayList<>(5);


//        list.add(5257);
//        list.add(552);
//        list.add(5548);
//        list.add(5465);
//        list.add(5455);
//        list.add(5546);
//        list.add(556);
//        list.add(5556);
//        list.add(5546);
//        list.add(46);
//        System.out.println(list);
//        // function :
//
//        System.out.println(list.get(2));
//        System.out.println(list.contains(5546));
//        System.out.println(list.remove(2));
//        System.out.println(list.set(1, 99));
//        System.out.println(list.remove(8));
//        System.out.println(list);


        // Input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        // get itom at index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));// pass index here, list[index] syntax will not work here
        }
        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println(list.size());



    }
}
