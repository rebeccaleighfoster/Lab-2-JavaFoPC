package ProgLang.lab2;
import java.util.Scanner;

public class MonthInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.print("Enter a month (1-12): ");
        int month = input.nextInt();

        String monthName;
        int daysInMonth;

        switch (month) {
            case 1:
                monthName = "January";
                daysInMonth = 31;
                break;
            case 2:
                monthName = "February";
                if ((year % 100 == 0 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
                    daysInMonth = 29; // Leap year
                } else {
                    daysInMonth = 28; // Non-leap year
                }
                break;
            case 3:
                monthName = "March";
                daysInMonth = 31;
                break;
            case 4:
                monthName = "April";
                daysInMonth = 30;
                break;
            case 5:
                monthName = "May";
                daysInMonth = 31;
                break;
            case 6:
                monthName = "June";
                daysInMonth = 30;
                break;
            case 7:
                monthName = "July";
                daysInMonth = 31;
                break;
            case 8:
                monthName = "August";
                daysInMonth = 31;
                break;
            case 9:
                monthName = "September";
                daysInMonth = 30;
                break;
            case 10:
                monthName = "October";
                daysInMonth = 31;
                break;
            case 11:
                monthName = "November";
                daysInMonth = 30;
                break;
            case 12:
                monthName = "December";
                daysInMonth = 31;
                break;
            default:
                monthName = "Invalid month";
                daysInMonth = 0;
                break;
        }

        System.out.println(monthName + " " + year + " has " + daysInMonth + " days.");
    }
}

//This was a little tricky for me cause I wasnt sure if i should just write a billion (12) switches, 
//or if there are ways to group them?