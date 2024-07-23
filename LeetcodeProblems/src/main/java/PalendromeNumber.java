import java.util.ArrayList;

public class PalendromeNumber {

    public static void main(String[] args) {

        boolean a = isPalindrome(5);
        boolean b = isPalindrome(123);
        boolean c = isPalindrome(-121);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

    public static boolean isPalindrome(int x) {
        if ( x < 0 ) return false;

        ArrayList<Integer> digits = new ArrayList<>();
        while ( x > 0 ) {
            digits.add( x % 10 ); //get the digit at the ones place
            x = x / 10; //shift the number down - brings the tens place to the ones place
        }

        //2 pointer method
        int start = 0;
        int end = digits.size() - 1;

        while ( start < end ) {
            int digitA = digits.get( start ); //digit at the start
            int digitB = digits.get( end ); //digit at the end

            if ( digitA != digitB ) {
                return false;
            }

            start++; //increment
            end--; //decrement
        }
        return true;
    }
}
