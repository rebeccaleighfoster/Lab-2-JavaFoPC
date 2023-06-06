package ProgLang.lab2;
import java.util.Scanner;

public class DatingAgeLimits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Enter the age of the person you want to date: ");
        int partnerAge = input.nextInt();

        int lowerLimit = (age / 2) + 7;
        int upperLimit = (age - 7) * 2;

        if (partnerAge >= lowerLimit && partnerAge <= upperLimit) {
            System.out.println("You can date this person!");
        } else {
            System.out.println("Sorry, you can't date this person.");
        }
    }
}
//I have done this prompt in a few diff languages so that helps, but just learning java quirks and syntax
//is the only trouble i had