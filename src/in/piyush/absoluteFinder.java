package in.piyush;

import java.util.Scanner;

public class absoluteFinder {
    public static void main(String[] args) {
        System.out.println("Absolute Finder");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();
        int result = num > 0 ? num : -num;
        System.out.println("The Absolute is: " + result);
    }
}
