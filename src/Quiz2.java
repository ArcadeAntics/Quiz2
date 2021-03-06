
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author simma1980
 */
public class Quiz2 {

    /**
     * Takes in a number and calculates the sum from 1 to that number Example:
     * sumUpTo(5) would return 15 Because 1 + 2 + 3 + 4 + 5 = 15
     *
     * @param n the number to sum up to
     * @return
     */
    public int sumUpTo(int n) {
        if (n == 1) {
            return 1;
        }
        return sumUpTo(n - 1) + n;
    }

    /**
     * Takes in a String and returns the same String in reverse
     *
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word) {
        if (word.length() == 1 || word.length() == 0) {
            return word;
        }
        String first = word.substring(0);
        String last = word.substring(word.length() - 1);
        word = word.substring(1, word.length() - 1);
        return last + reverseString(word) + first;  
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.println(test.sumUpTo(n));
        //use test.sumUpTo(__)  or test.reverseString(___) to test
        in.nextLine();
        System.out.print("Enter a word: ");
        String word = in.nextLine();
        System.out.println(test.reverseString(word));
    }
}
