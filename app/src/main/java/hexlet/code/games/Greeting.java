package hexlet.code.games;

import java.util.Scanner;

public class Greeting {
    public static String userName;
    public static void greeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name?");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        //scanner.close();
    }
}
