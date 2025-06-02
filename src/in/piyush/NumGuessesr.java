package in.piyush;

import java.util.Scanner;

public class NumGuessesr {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Guess A Number Between 1 and 6:  ");
        int guess = input.nextInt();
        int num;
        num = (int) Math.ceil(Math.random() * 100);

        do {
            if (guess > num){
                System.out.println("The Number is not that Big");
            } else if (guess < num) {
                System.out.println("The Number is not that Small");
            }
            System.out.print("Guess A Number Between 1 and 6:  ");
            guess = input.nextInt();
        } while (guess != num);
        System.out.println("You Guessed The Number");


    }
}
