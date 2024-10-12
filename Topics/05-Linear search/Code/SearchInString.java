import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Shivendra";
        char target = 'a' ;
        System.out.println(Arrays.toString(name.toCharArray())); // Print string Array
        System.out.println(Searchstring(name, target));

    }
    static boolean Searchstring (String str , char target) {
        if(str.length() == 0) {
            return false ; 
        }
        for (int indx = 0; indx < str.length(); indx++) {  // Also we can use for each loop
            if (target  == str.charAt(indx)) {
                return true ;
            }
        }
        return false;
    }
}
