package exercise04;

import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Noun: ");
        String noun = userInput.nextLine();
        System.out.println("Verb: ");
        String verb = userInput.nextLine();
        System.out.println("Adjective: ");
        String adjective = userInput.nextLine();
        System.out.println("Adverb: ");
        String adverb = userInput.nextLine();

        System.out.println("The " +adjective +" " +noun +" " +verb +" " +adverb +"." );
    }
}
