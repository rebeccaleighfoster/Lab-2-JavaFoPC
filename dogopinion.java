package ProgLang.lab2;
import java.util.Scanner;

public class dogopinion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Do you like dogs? (yes/no): ");
        String answer = input.nextLine();

        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("I like dogs too!");
        } else {
            System.out.println("Oh, that makes me deeply sad and uncomfortable.");
        }
    }
}

//This code does not account for if someone writes something other than yes or no, also i had to research  java.util.Scanner;, 
//also another troubling thing is I had to think about the possibility of someone who does not like dogs?!