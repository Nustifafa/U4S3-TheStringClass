package com.codedifferently.labs.partB.ex04;//Specifies the package in which the current Java class belongs. Packages are used to group related classes and interfaces together, helping organize the code and avoid naming conflicts.
public class ExtractionExample {//defines class in Java. "Public" is the access modifier, it means the class is accessible from any other class or package. It indicates that the class is publicly visible and can be used by other parts of the program.
    //class: This keyword is used to define a class in Java. A class is a blueprint for creating objects (instances) and can contain fields (variables) and methods (functions).
    //ReplaceExample: This is the name of the class. By convention, class names in Java start with an uppercase letter and are written in CamelCase (each word starts with an uppercase letter).

    public static String extract(){//is a declaration of a method in Java.
        String response = ""; //String: This is the data type of the variable. It indicates that the variable response will hold a string (a sequence of characters).
        //response: This is the variable name. It's the identifier used to refer to the value stored in this variable. You can choose any name for the variable, but response suggests that it might be used to store some kind of answer or result.
        //= "": This is the initialization of the variable. It sets response to an empty string (""). An empty string is a string with zero characters.

        String phoneNumber = "867-5309"; //String: This is the data type. It specifies that the variable phoneNumber will store a string value (a sequence of characters).
        //phoneNumber: This is the variable name. It refers to the value "867-5309" that is assigned to it.
        //"867-5309": This is the string literal that holds the value of the phone number.
        String subString = phoneNumber.substring(3,6);//phoneNumber: This is the original string from which the substring will be taken (e.g., "867-5309").
        //substring(3, 6): The substring() method extracts a portion of the string between the specified start and end indices.
        //Start index (3): This is where the substring extraction begins. In this case, it starts at index 3. Remember, string indices in Java are 0-based, so index 3 corresponds to the 4th character of the string.
        //End index (6): This is where the substring extraction ends. The character at the end index is not included. So, this method will take characters up to, but not including, index 6.
        response += subString; //concatenate response and substring


        return response;//return: This keyword indicates that the method will end and send a value back to the code that called the method.
        // response: This is the value being returned. In this case, response is likely a string variable that holds some value, and that value will be returned to the method's caller.
    }
    public static void main(String[] args) {//void: This is the return type of the main method. void means the method doesn't return any value. It simply runs the program.
        //main: This is the name of the method. It's a special method in Java, recognized by the Java runtime as the entry point for the application.
        //String[] args: This is a parameter to the main method. It represents an array of command-line arguments passed to the program when it is run. These arguments are typically used to provide input values to the program. args stands for "arguments", and each item in the array is a string (even if it's a number or another type of input).
        String extractOutput = extract(); //String: This is the data type of the variable concat. It's declaring that concat will hold a value of type String.
        //concat: This is the variable name. It's storing the return value of the concat() method.
        //=: The assignment operator. This assigns the value returned by the concat() method to the variable concat.
        // concat(): This is the method call. It's calling the method concat() (likely a method you defined earlier), which returns a String.
        System.out.print(extractOutput); //prints variable concat
    }
}


