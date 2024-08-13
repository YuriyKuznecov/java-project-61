package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class GCD {
    public static void gcdGame() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Find the greatest common divisor of given numbers.");
        do {
            var number1 = (int) (Math.random() * Engine.RANDOM_INT);
            var number2 = (int) (Math.random() * Engine.RANDOM_INT);
            var question = "%d %d".formatted(number1, number2);
            System.out.println("Question: " + question);
            System.out.print("Your Answer: ");
            String answer = scan.next();
            String correctAnswer = Integer.toString(gcd(number1, number2));
            Engine.engine(answer, correctAnswer);
        } while (Engine.getIsCorrect() && Engine.getCount() < Engine.MAX_COUNT);
    }

    static int gcd(int a, int b) {
        int gcd = 1;
        if (a == 0) {
            gcd = b;
        } else if (b == 0) {
            gcd = a;
        } else {
            for (var i = 1; i <= Math.min(a, b); i++) {
                if (a % i == 0 && b % i == 0) {
                    gcd = i;
                }
            }
        }
        return gcd;
    }
}
