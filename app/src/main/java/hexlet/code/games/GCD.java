package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class GCD {
    public static void gcd() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Find the greatest common divisor of given numbers.");
        do {
            var number1 = (int) (Math.random() * 100);
            var number2 = (int) (Math.random() * 100);
            var question = "%d %d".formatted(number1, number2);
            System.out.println("Question: " + question);
            System.out.print("Your Answer: ");
            String answer = scan.next();
            String correctAnswer = Integer.toString(gcd(number1, number2));
            Engine.engine(answer, correctAnswer);
        } while (Engine.isCorrect && Engine.count < 3);
    }

    static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
