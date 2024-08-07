package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Event;
import hexlet.code.games.GCD;
import hexlet.code.games.Greeting;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Event");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String number = scanner.next();
        System.out.print("\n");
        selectGame(number);
    }

    static void selectGame(String str) {
        switch (str) {
            case "1" :
                Greeting.greeting();
                break;
            case "2" :
                Greeting.greeting();
                Event.event();
                break;
            case "3" :
                Greeting.greeting();
                Calculator.calc();
                break;
            case "4" :
                Greeting.greeting();
                GCD.gcd();
                break;
            case "5" :
                Greeting.greeting();
                Progression.progression();
                break;
            case "6" :
                Greeting.greeting();
                Prime.prime();
                break;
            default:
                System.out.println("Incorrect number entered.");
        }
    }
}

