package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class Prime {
    public static void prime() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        do {
            var number = (int) (Math.random() * 100);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scan.next();
            String correctAnswer = isSimple(number) ? "yes" : "no";
            Engine.engine(answer, correctAnswer);
        } while (Engine.isCorrect && Engine.count < 3);
    }

    static boolean isSimple(int num) {
        if (num < 2) {
            return false;
        }
        for (var i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
