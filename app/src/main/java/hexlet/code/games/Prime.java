package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static void prime() {
        String questionMessage = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] question = new String[Engine.MAX_ATTEMPT];
        String[] correctAnswer = new String[Engine.MAX_ATTEMPT];
        for (var i = 0; i < Engine.MAX_ATTEMPT; i++) {
            var number = Utils.randomInt(0, Engine.MAX_INT_100);
            question[i] = Integer.toString(number);
            correctAnswer[i] = isSimple(number) ? "yes" : "no";
        }
        Engine.engine(questionMessage, question, correctAnswer);
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
