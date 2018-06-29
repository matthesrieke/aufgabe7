
package de.hsbo.fbg.kswe.exceptionhandling.words;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class TextAnalyzer {

    public TextAnalyzer() {
    }

    /**
     * finds the first longest word
     * 
     * @param text
     * @return 
     */
    public String findLongestWord(String text) {
        String[] words = text.split(" ");
        
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        
        return longest;
    }

}
