
package wordreverse;

import java.util.Scanner;


/**
 *
 * @author tange
 */
public class WordReverse {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a word");
        
        String word = input.nextLine();
        
        char[] wordArray = new char[word.length()];
        
        for (int i = 0; i < word.length(); i++) {
            
            wordArray[i] = word.charAt(i);
        }
        
        String wordReverse = "";
        
        for (int i = wordArray.length - 1; i >= 0; i--) {
            
            wordReverse += wordArray[i];
            
            System.out.print(wordArray[i]);
        } 
        
        System.out.println("The reverse is: " + wordReverse);
    }
}
