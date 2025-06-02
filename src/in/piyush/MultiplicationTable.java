package in.piyush;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Multiplication Table Maker");
        Scanner input = new Scanner(System.in);

        System.out.print("Table Of Which Number Do You Want to See: ");
        int table = input.nextInt();
        int i;
        for (i = table; i <= 10; i++ ) {
            System.out.println(table + " X " + i + " = " + (table * i));
        }
    }
}
