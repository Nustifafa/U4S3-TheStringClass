package com.codedifferently.labs.partC;

public class AlgoChallenge {

/* Problem 1
    The instructor provided you with a non-empty string and a number n.
    The instructor wants you to remove the letter at index n and provide a new string.
    Tip: Value of n should be a valid index of a given letter in the original string,
    such as 0 or str.length()-1 inclusive
    missingLetter("kitten", 1) --> "ktten"
    missingLetter("kitten", 0) --> "itten"
    missingLetter("kitten", 4) --> "kittn"
     */


    public static String missingLetter(String letter, int n) {

        return letter.substring(0, n) + letter.substring(n + 1);

    }

    /* Problem 2
    Given the word of the day, take the last letter and
    return a new word of the day when you add the last letter to the front and back of the word.
    For example, "founder" yields "rfounderr".
    Tip: The word of the day will be a length 1 or more
    wordOfDay("cat") --> "tcatt"
    wordOfDay("Hello" --> "oHelloo"
    wordOfDay("a") --> "aaa"
     */

    public static String wordOfDay(String word) {

        // Get the last letter of the word
        char lastChar = word.charAt(word.length() - 1);
        // Add the last letter to the front and back of the word
        return lastChar + word + lastChar;
    }
    public static void main(String[] args) {
        // Testing the missingLetter method
        System.out.println("missingLetter('kitten', 1): " + missingLetter("kitten", 1)); // Expected "ktten"
        System.out.println("missingLetter('kitten', 0): " + missingLetter("kitten", 0)); // Expected "itten"
        System.out.println("missingLetter('kitten', 4): " + missingLetter("kitten", 4)); // Expected "kittn"

        // Testing the wordOfDay method
        System.out.println("wordOfDay('cat'): " + wordOfDay("cat")); //expected "tcatt"
        System.out.println("wordOfDay('Hello'): " + wordOfDay("Hello")); // Expected "oHelloo"
        System.out.println("wordOfDay('a'): " + wordOfDay("a")); // Expected "aaa"
    }
}


