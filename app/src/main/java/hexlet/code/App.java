package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
        Please enter the game number and press Enter.
        1 - Greet
        2 - Even
        3 - Calc
        4 - GCD
        5 - Progression
        6 - Prime
        0 - Exit
            """);
        System.out.print("Your choice: ");
        var number = scanner.next();
        System.out.println();
        selectGame(number);
    }

    static void selectGame(String str) {
        switch (str) {
            case "1" -> Cli.greeting();
            case "2" -> Even.event();
            case "3" -> Calculator.calc();
            case "4" -> GCD.gcdGame();
            case "5" -> Progression.progression();
            case "6" -> Prime.prime();
            default ->
                System.out.println("Incorrect number entered.");
        }
    }
}

