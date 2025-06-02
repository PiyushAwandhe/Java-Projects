package in.piyush;

import java.util.Scanner;

public class passwordChecker {
    public static void main(String[] args) {
        System.out.println("Welcome To Password Checker");
        Scanner input = new Scanner(System.in);
        String password;
        do {
            System.out.print("Please Enter Your Password : ");
             password = input.next();
        } while (!isCorrect(password));
        System.out.println("The Password Is Valid");
    }

    public static boolean isCorrect(String password) {
        return password.length() > 6;
    }
}
