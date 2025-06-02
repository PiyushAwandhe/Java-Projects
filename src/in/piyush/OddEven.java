package in.piyush;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Welcome TO Odd Even Finder");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter Your Number: ");
        int num = input.nextInt();
        String result = num % 2 == 0 ? "Even": "Odd";
        System.out.println("Your Number Is: " + result);
    }
}
