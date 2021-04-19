import java.util.Scanner;

public class PalindromeRecursionWithIndices {


    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.println(isPalindrome(sc.nextLine()));





    }

    public static boolean isPalindrome(String s){
        return isPalindrome(s, 0 , s.length()-1 );
    }

    public static boolean isPalindrome(String word, int low, int high){
        if(high <= low ){
            System.out.println("This is a palinDrome ");
            return true;
        }
        if(word.charAt(low) != word.charAt(high)) return false;
        return isPalindrome(word, low+1, high -1);
    }

}
