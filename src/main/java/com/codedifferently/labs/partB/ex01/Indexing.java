package com.codedifferently.labs.partB.ex01;

public class Indexing {
    public static String index() {
        String response = "";
        String myStr = "Hello planet earth, you are a great planet.";
        /* Your code goes here*/

        // Find the first occurrence of 'e'
        int firstIndex = myStr.indexOf('e');
        response += "First 'e' found at index: " + firstIndex + "\n";

        // Find the next occurrence of 'e' starting just after the first 'e'
        int nextIndex = myStr.indexOf('e', firstIndex + 1);
        response += "Next 'e' found at index: " + nextIndex;

        return response;
    }

    public static void main(String[] args) {
        String indexOutput = index();
        System.out.println(indexOutput);
    }
}


