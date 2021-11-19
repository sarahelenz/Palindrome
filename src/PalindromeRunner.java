/**
 * Created by bob.brown on 12/8/16.
 */
public class PalindromeRunner {
    public static void main(String args[])
    {
        //Should have true
        boolean isPalindrome = Palindrome.determineIfPalindrome("racecar","racecar");
        System.out.println(isPalindrome);

        //Should have your entered String
        String input = Palindrome.getInput();
        System.out.println(input);

        //Should have all spaces and punctuation removed
        String noPunc = Palindrome.removeCharacters("Hello, there's alot of Punctuation!");
        System.out.println(noPunc);

        //Should have 54321
        String reversed = Palindrome.reverse("12345");
        System.out.println(reversed);
    }
}
