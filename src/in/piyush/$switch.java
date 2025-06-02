

package in.piyush;

import java.util.Scanner;

public class $switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Day of the Week detector");
        System.out.print("Enter Your day in number:  ");
        int day = input.nextInt();
        oldSwitch(day);
        newSwitch(day);
    }

    public static void newSwitch(int day) {
        String dayStr;
        switch (day) {
            case 1:
                dayStr = "Monday";
                break;
            case 2:
                dayStr = "Tuesday";
                break;
            case 3:
                dayStr = "Wednesday";
                break;
            case 4:
                dayStr = "Thursday";
                break;
            case 5:
                dayStr = "Friday";
                break;
            case 6:
                dayStr = "Saturday";
                break;
            case 7:
                dayStr = "Sunday";
                break;
            default:
                dayStr = "Invalid";
                break;
        }
        System.out.println(dayStr);
    }

    public static void oldSwitch(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter a valid Day in Number");

        }
    }
}
