package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static void prime() {
        String questionMessage = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionAndAnswer = new String[Engine.MAX_ATTEMPT][2];
        for (var i = 0; i < Engine.MAX_ATTEMPT; i++) {
            var number = Utils.randomInt(0, Engine.MAX_INT_100);
            questionAndAnswer[i][0] = Integer.toString(number);
            questionAndAnswer[i][1] = isSimple(number) ? "yes" : "no";
        }
        Engine.engine(questionMessage, questionAndAnswer);
    }

    private static boolean isSimple(int num) {
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
