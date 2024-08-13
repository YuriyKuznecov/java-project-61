package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class Prime {
    public static void prime() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        do {
            var number = (int) (Math.random() * Engine.RANDOM_INT);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scan.next();
            String correctAnswer = isSimple(number) ? "yes" : "no";
            Engine.engine(answer, correctAnswer);
        } while (Engine.getIsCorrect() && Engine.getCount() < Engine.MAX_COUNT);
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
