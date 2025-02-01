package com.codedifferently.labs.partA.ex01;

public class ShoppingCart {
    public static String name() {
        String response = "";
        String custName = "Hakim Smith"; //The full customer name
        String firstName;
        int spaceIdx;

        // Get the index of the space character (" ") in custName.
        spaceIdx = custName.indexOf(" "); //This line finds the position of the space character in the custName string, which separates the first name and last name.


        // Use the substring method to parse out the first name and print it.
        firstName = custName.substring(0, spaceIdx); // Extract first name portion of custName from the start (index 0) to the position of the space which is the first name.
        response = firstName; //assign firstName to response

        return response; //Return the first name from the name() method
    }
    public static void main(String[] args) {
        String nameOut = name(); //Call the name() method to get the first name
        System.out.println(nameOut); //print the first name


    }
}
