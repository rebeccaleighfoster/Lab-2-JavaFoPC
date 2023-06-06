package ProgLang.lab2;
import java.util.Scanner;

public class TemperatureAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature 1: ");
        double temp1 = input.nextDouble();
        System.out.print("Enter temperature 2: ");
        double temp2 = input.nextDouble();
        System.out.print("Enter temperature 3: ");
        double temp3 = input.nextDouble();

        double average = (temp1 + temp2 + temp3) / 3;

        if (average > 90) {
            System.out.println("Stay cool, it's hot out!");
        } else if (average >= 70 && average <= 89) {
            System.out.println("A little warm, but nice.");
        } else if (average >= 50 && average <= 69) {
            System.out.println("Nice weather we've been having, huh?");
        } else if (average >= 33 && average <= 50) {
            System.out.println("Been chilly lately, huh?");
        } else {
            System.out.println("Brrr!! It's cold!");
        }
    }
}
//again it does not account for users entering non integers, also I have a weirdly difficult time getting the averages to calculate correctly