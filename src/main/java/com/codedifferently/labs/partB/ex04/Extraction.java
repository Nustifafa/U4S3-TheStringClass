package com.codedifferently.labs.partB.ex04;

public class Extraction {

    public static String extraction(){
        String response = "";
        String greeting = "Learning Java is a good time!";

        /* Your code goes here*/
        String subString = greeting.substring(0,5);
        String goodGreeting = greeting.substring(7,11);
        String badGreeting = greeting.substring(7,29);
        subString = subString  + "\n" +  goodGreeting  + "\n" +  badGreeting;
        response += subString;
        return response;

    }
    public static void main(String[] args) {
        String extractionOutput = extraction();
        System.out.println(extractionOutput);
    }
}
