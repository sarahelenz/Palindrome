import com.sun.source.tree.WhileLoopTree;

import javax.swing.*;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String wordOrPhrase = getInput();
        String noCharactersOriginal = removeCharacters(wordOrPhrase);
        String reversed = reverse(noCharactersOriginal);
        String noCharactersReversed = removeCharacters(reversed);
        boolean finalAnswer = determineIfPalindrome(noCharactersOriginal, noCharactersReversed);

        System.out.println("Your original phrase was " + noCharactersOriginal + "\nThat phrase reversed is: " + reversed + "\nIs it a palindrome? " + finalAnswer);


    }
    public static String getInput(){
        String line;
       do {
            line = JOptionPane.showInputDialog("Please enter a word or sentence that is 40 characters or less");
       } while (line.length() > 40);
        return line;
    }
    public static String removeCharacters(String original){
        String done = new String();
        for(int x = 0; x <= original.length() - 1; x++){
            String currentLetter = original.substring(x, x + 1);
            if(currentLetter.equals(" ") || currentLetter.equals(",") || currentLetter.equals("!") || currentLetter.equals(".") || currentLetter.equals(",") || currentLetter.equals("\"") || currentLetter.equals("/") || currentLetter.equals("\\") || currentLetter.equals("@") || currentLetter.equals("(") || currentLetter.equals(")") || currentLetter.equals("*")|| currentLetter.equals("'")|| currentLetter.equals("|")){
                currentLetter = "";
            }
            done += currentLetter;
        }
        return done;
    }
    public static String reverse(String original){
        String reversed = new String();
        for(int x = original.length() - 1; x >= 0; x--){
            String currentLetter = original.substring(x, x + 1);
            reversed += currentLetter;
        }
        return reversed;
    }
    public static boolean determineIfPalindrome(String original, String reversedString){
        if(!(original.equalsIgnoreCase(reversedString))){
            return false;
        }else {
            return true;
        }
    }
}
