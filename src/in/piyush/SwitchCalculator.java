package in.piyush;

import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome To My Calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your First Number:  ");
        int num1 = input.nextInt();
        System.out.print("Enter Your Operation:  ");
        String op = input.next();
        System.out.print("Enter Your Second Number:  ");
        int num2 = input.nextInt();

        int result;
        switch (op) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                result = -1;
                break;
        }


        System.out.println(num1 + op + num2 + "=" + result);
    }
}
