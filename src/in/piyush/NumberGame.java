package in.piyush;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        System.out.println("Number Game");
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int randomNum = random.nextInt(2);
        System.out.println("Enter Your Guess:  ");
        int guess = input.nextInt();

        do {
            System.out.println("Enter Your Guess:  ");
             guess = input.nextInt();
        }
        while (randomNum == guess);
        System.out.println("You Caught ME");
    }
    }



