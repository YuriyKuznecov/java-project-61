package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void event() {
        String questionMessage = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionAndAnswer = new String[Engine.MAX_ATTEMPT][2];
        for (var i = 0; i < Engine.MAX_ATTEMPT; i++) {
            var number = Utils.randomInt(0, Engine.MAX_INT_100);
            questionAndAnswer[i][0] = Integer.toString(number);
            questionAndAnswer[i][1] = isEven(number) ? "yes" : "no";
        }
        Engine.engine(questionMessage, questionAndAnswer);
    }

    private static boolean isEven(int a) {
        return a % 2 == 0;
    }
}
