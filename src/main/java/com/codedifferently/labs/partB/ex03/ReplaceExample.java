package com.codedifferently.labs.partB.ex03; //Specifies the package in which the current Java class belongs. Packages are used to group related classes and interfaces together, helping organize the code and avoid naming conflicts.
public class ReplaceExample {//defines class in Java. "Public" is the access modifier, it means the class is accessible from any other class or package. It indicates that the class is publicly visible and can be used by other parts of the program.
    //class: This keyword is used to define a class in Java. A class is a blueprint for creating objects (instances) and can contain fields (variables) and methods (functions).
    //ReplaceExample: This is the name of the class. By convention, class names in Java start with an uppercase letter and are written in CamelCase (each word starts with an uppercase letter).

    public static String replace(){ //is a declaration of a method in Java.
        String response = ""; //String: This is the data type of the variable. It indicates that the variable response will hold a string (a sequence of characters).
        //response: This is the variable name. It's the identifier used to refer to the value stored in this variable. You can choose any name for the variable, but response suggests that it might be used to store some kind of answer or result.
        //= "": This is the initialization of the variable. It sets response to an empty string (""). An empty string is a string with zero characters.
        String replace = "String replace with replace First"; //is declaring a String variable called replace and initializing it with the value "String replace with replace First".
        String newString = replace.replaceFirst("re", "RE"); //uses the replaceFirst() method to replace the first occurrence of the substring "re" with "RE" in the replace string. Let's break it down:
        //replaceFirst("re", "RE"): This method searches for the first occurrence of the substring "re" and replaces it with "RE".
        //It only replaces the first occurrence of "re" in the string. If there are more occurrences, they remain unchanged.
        //replace: This is the original string you're working with, such as "String replace with replace First".
        //newString: This variable stores the result of the replacement. The updated string will be assigned to newString.
        response += newString; //adds the newString value to the response value

        return response;//return: This keyword indicates that the method will end and send a value back to the code that called the method.
        // response: This is the value being returned. In this case, response is likely a string variable that holds some value, and that value will be returned to the method's caller.
    }
    public static void main(String[] args) {//void: This is the return type of the main method. void means the method doesn't return any value. It simply runs the program.
        //main: This is the name of the method. It's a special method in Java, recognized by the Java runtime as the entry point for the application.
        //String[] args: This is a parameter to the main method. It represents an array of command-line arguments passed to the program when it is run. These arguments are typically used to provide input values to the program. args stands for "arguments", and each item in the array is a string (even if it's a number or another type of input).
        String replacedOutput = replace(); //String: This is the data type of the variable concat. It's declaring that concat will hold a value of type String.
        //concat: This is the variable name. It's storing the return value of the concat() method.
        //=: The assignment operator. This assigns the value returned by the concat() method to the variable concat.
        // concat(): This is the method call. It's calling the method concat() (likely a method you defined earlier), which returns a String.
        System.out.println(replacedOutput); //prints variable concat
    }
}
