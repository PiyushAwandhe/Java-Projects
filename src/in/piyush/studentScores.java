package in.piyush;

import java.util.Scanner;

public class studentScores {
    public static void main(String[] args) {
        System.out.println("Welcome to Students Grade Identifier");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Marks: ");
        int marks = input.nextInt();
        String category = marks > 80 ? "High" : (marks > 50 ?  "Moderate" :"Low");
        System.out.println("Your Category is: " + category);

    }
}
