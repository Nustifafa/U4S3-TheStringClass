package com.codedifferently.labs.partB.ex01;

public class IndexingExample { //defines class

    public static String index(){ //declares String index()
        String response = ""; //

        String phoneNum = "404-543-2345"; //initialize phoneNum string with the valur
        int idx1 = phoneNum.indexOf('-'); //The indexOf('-') is used to find the first dash (-) in the string. The method returns the index (position) of the first occurrence of the dash
        response += "index of first dash: "+ idx1 + "\n"; //Used to find the second dash. This method starts searching from the positions just after the first dash, which is indicated by idx1 + 1
        int idx2 = phoneNum.indexOf('-', idx1 + 1); //This method starts searching from the positions just after the first dash, which is indicated by idx1 + 1
        response += "second dash index: "+ idx2;

        return response; //returns the value of the response variable back to the caller of the method
    }

    public static void main(String args[]) { //domain
        String indexOutput = index(); //printed to the console
        System.out.print(indexOutput); //outputted
    }
}
