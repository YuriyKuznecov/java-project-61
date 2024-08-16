package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void gcdGame() {
        String questionMessage = "Find the greatest common divisor of given numbers.";
        String[] question = new String[Engine.MAX_ATTEMPT];
        String[] correctAnswer = new String[Engine.MAX_ATTEMPT];
        for (var i = 0; i < Engine.MAX_ATTEMPT; i++) {
            var number1 = (int) (Math.random() * Engine.RANDOM_INT);
            var number2 = (int) (Math.random() * Engine.RANDOM_INT);
            question[i] = "%d %d".formatted(number1, number2);
            correctAnswer[i] = Integer.toString(gcd(number1, number2));
        }
        Engine.engine(questionMessage, question, correctAnswer);
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
