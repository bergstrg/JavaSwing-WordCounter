package scan;

import java.io.File;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Gabriel Bergstrom
 */
public class FileScanner {
    /**
     * This function takes in the path of the text file as a param and uses while and for loops to place each word into a Hash map
     * Once all words have been scanned and placed into the hash map then the function uses a for loop to output each word in the hash map
     * with the total number of times that word is present. The function then outputs the total number of words and total number of different words.
     *
     * @param absolutePath This is the file path for the text file that the user has selected to scan.
     */
    private int differentWordCount;
    private int totalWordCount;
    private String scannerResults = "";

    public void fileScanner(Scanner absolutePath) {
        try {
            /**
             * This will be where I will need to hook up the GUI File Browser
             */
            Scanner input = absolutePath;
            File file = new File(input.nextLine());
            input = new Scanner(file);
            Map m1 = new HashMap();

            /**
             * Loops through the text file.
             */
            while (input.hasNext()) {

                String userInput = input.next();
                userInput = userInput.toLowerCase();
                userInput = userInput.replaceAll("[^a-zA-Z0-9_-]", " "); // strip out any non words.
                userInput = userInput.replaceAll("  ", " ");  // strip out any double spacing
                String[] tokens = userInput.split(" ");

                /**
                 * This looping is where the characters found in the text file are put into the Hashmap
                 */

                for (int i = 0; i < tokens.length; i++) {
                    if (m1.get(tokens[i]) == null) {
                        m1.put(tokens[i], 1);
                    } else {
                        int newValue = Integer.valueOf(String.valueOf(m1.get(tokens[i])));
                        newValue++;
                        m1.put(tokens[i], newValue);


                    }
                }
            }
            /**
             *
             * This section takes the HashMap where all the words are stored and outputs them.
             * There is a counter for the number of different words and total number of words.
             * The first key in the Hashmap is removed because that key is counting the number of blank spaces
             * from the replacement of special characters.
             */
            m1.remove("");
            Map<String, String> sorted = new TreeMap<String, String>(m1);
            for (Object key : sorted.keySet()) {
                scannerResults = scannerResults.concat("Word: " + key + "\tCounts: " + m1.get(key) + "\n");
                differentWordCount++;
                totalWordCount = totalWordCount + (int) m1.get(key);
            }
            setScannerResults(scannerResults);
            setDifferentWordCount(differentWordCount);
            setTotalWordCount(totalWordCount);
        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }

    /**
     * @param differentWordCount This function takes in the count for the number of different words in the text file.
     */
    private void setDifferentWordCount(int differentWordCount) {
        this.differentWordCount = differentWordCount;
    }

    /**
     * @return This function returns the count for the number of different words in the text file.
     */
    public int getDifferentWordCount() {
        return differentWordCount;
    }

    /**
     * @param totalWordCount This function takes in the total word count for the text file
     */
    private void setTotalWordCount(int totalWordCount) {
        this.totalWordCount = totalWordCount;
    }

    /**
     * @return This function return the total word count for the text file.
     */
    public int getTotalWordCount() {
        return totalWordCount;
    }

    /**
     * @param scannerResults This function takes in a concatenated string that has each individual word found in the text file
     *                       with a count of how many times that word was found in the text file.
     */
    private void setScannerResults(String scannerResults) {
        this.scannerResults = scannerResults;
    }

    /**
     * @return This function returns a concatenated string that has each individual word found in the text file
     * with a count of how many times that word was found in the text file.
     */
    public String getScannerResults() {
        return scannerResults;
    }

}