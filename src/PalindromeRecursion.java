import java.util.Scanner;

public class PalindromeRecursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isPalindrome(sc.nextLine()));
    }

    private static boolean isPalindrome(String word) {
     if(word.length() <= 1 ){
        System.out.println("This is a palindrome");
        return true;
    }else if(word.charAt(0) != word.charAt(word.length()-1)) return false;

    String subString = word.substring(1, word.length()-1);
    return isPalindrome(subString);
    }


}
