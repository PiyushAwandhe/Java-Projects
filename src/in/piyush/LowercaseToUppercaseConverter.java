package in.piyush;

import java.util.Scanner;

public class LowercaseToUppercaseConverter {
    public static void main(String[] args) {
        System.out.println("Welcome To Lowercase To Uppercase Converter");
        Scanner input = new Scanner(System.in);
        String prompt = "....";
        do {
            System.out.printf("%n Enter Your Prompt: ");
             prompt = input.nextLine();
            System.out.printf(" %S", prompt);
        } while ( prompt != null);

        if (prompt == prompt) {
            System.out.println("The Prompt is Succesfully Converted to Uppercase");
            System.out.printf(" %S", prompt);
        } else {
            System.out.println("You have entered a null value");
        }
    }
}
