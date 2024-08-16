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
        return b == 0 ? a : gcd(b, a % b);
    }
}
