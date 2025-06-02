package in.piyush;

import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number checker");
        System.out.println("Please enter your first number");
        int num1 = input.nextInt();
        System.out.println("Enter your second number");
        int num2 = input.nextInt();


        //int greaterNumber;

//        if (num1 > num2) {
//            greaterNumber = num1;
//        } else {
//            greaterNumber = num2;
//        }

        int greaterNumber = num1 > num2 ? num1 : num2;



        System.out.println(greaterNumber + " The greater number ");
    }
}
