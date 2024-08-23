package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static void gcdGame() {
        String questionMessage = "Find the greatest common divisor of given numbers.";
        String[][] questionAndAnswer = new String[Engine.MAX_ATTEMPT][2];
        for (var i = 0; i < Engine.MAX_ATTEMPT; i++) {
            var number1 = Utils.randomInt(0, Engine.MAX_INT_100);
            var number2 = Utils.randomInt(0, Engine.MAX_INT_100);
            questionAndAnswer[i][0] = "%d %d".formatted(number1, number2);
            questionAndAnswer[i][1] = Integer.toString(gcd(number1, number2));
        }
        Engine.engine(questionMessage, questionAndAnswer);
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
