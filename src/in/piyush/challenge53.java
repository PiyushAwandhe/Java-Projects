package in.piyush;

import java.util.Scanner;

public class challenge53 {
    public static void main(String[] args) {
        System.out.println("Welcome to the Minimum Number detector");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The First Number: ");
        int num1 = input.nextInt();
        System.out.print("Emter The Second Number: ");
        int num2 = input.nextInt();

        int smallerNumber = num1 > num2 ? num2 : num1;

        System.out.println("The Smallest Number is: " + smallerNumber);

    }
}
